class BubbleSort<T extends Comparable<T>> {
    public T[] array;

    public BubbleSort(T[] array) {
        this.array = array;
    }

    public void sort() {
        int n = array.length;

        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - j - 1; i++) {
                if (array[i + 1].compareTo(array[i]) < 0) {
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
}
