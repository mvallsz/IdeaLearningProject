class Demo {
    public static void bubbleSort(int[] array) {
        int length = array.length;
        for (int j = 0; j < length - 1; j++)
            for (int i = 0; i < length - j - 1; i++) {
                int i1 = i + 1;
                if (array[i] > array[i1]) {
                    int temp = array[i];
                    array[i] = array[i1];
                    array[i1] = temp;
                }
            }
    }
}
