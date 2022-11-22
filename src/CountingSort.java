class CountingSort {
    public static void countingSort(int[] array, int size) {

        int[] output = new int[size + 1];
        int max = array[0];
        for (int i = 0; i < size; i++) {
            max = Math.max(max, array[i]);
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < max; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        for (int i = 0; i < size; i++) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }

    }
}
