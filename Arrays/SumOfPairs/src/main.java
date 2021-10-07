import java.util.Scanner;

public class main {
    /**
     * show all the pairs where the sum of those pairs equal to the target value
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the target value: ");
        int targetValue = input.nextInt();

        System.out.println("--------------Doing this with Double Loop-----------------------");
        long startTimeDouble = System.nanoTime();
        SumDoubleLoop(targetValue);
        long endTimeDouble = System.nanoTime();
        System.out.println("That took double Loop: " + (endTimeDouble - startTimeDouble) + " nanoseconds to execute");

        System.out.println("--------------Doing this with Single Loop-----------------------");
        long startTime = System.nanoTime();
        SumSingleLoop(targetValue);
        long endTime = System.nanoTime();
        System.out.println("That took Single Loop: " + (endTime - startTime) + " nanoseconds to execute");
    }

    public static void SumDoubleLoop(int targetValue) {
        int[] array = {10, 20, 50, 35,5};
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetValue) {
                    System.out.println("(" + array[i] + "," + array[j] + ")");
                }
            }
        }
    }

    public static void SumSingleLoop(int targetValue) {
        int[] array = {10, 20, 50, 35,5};
        int start = 1;
        for (int i = 0; i < array.length; ) {
            if (start < array.length && i != start) {
                if (array[i] + array[start] == targetValue) {
                    System.out.println("(" + array[i] + "," + array[start] + ")");
                }
            }
            start++;
            if (start == array.length) {
                start = i + 1;
                i++;
            }
        }
    }
}
