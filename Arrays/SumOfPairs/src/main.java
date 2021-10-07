public class main {
    /**
     * show all the pairs where the sum of those pairs equal to the target value
     */
    public static void main(String[] args) {
        int targetValue = 40;
        SumDoubleLoop(targetValue);
        System.out.println("Single Loop values");
        SumSingleLoop(targetValue);
    }

    public static void SumDoubleLoop(int targetValue) {
        int[] array = {-10, 18, 50, 35, 30, 20, 10, 9, 1, 9, 22, 8, 6, 4, 3, 7};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetValue) {
                    System.out.println("(" + array[i] + "," + array[j] + ")");
                }
            }
        }
    }

    public static void SumSingleLoop(int targetValue) {
        int[] array = {-10, 18, 50, 35, 30, 20, 10, 9, 1, 9, 22, 8, 6, 4, 3, 7};
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
