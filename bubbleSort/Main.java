public class Main {

    public static void main(String[] args) {
        Tree[] trees = {
                new Tree(3),
                new Tree(5),
                new Tree(2),
                new Tree(4),
                new Tree(1)
        };

        BubbleSort<Tree> bs = new BubbleSort<Tree>(trees);

        bs.sort();

        // bubbleSort(trees);

        for (Tree tree : trees) {
            System.out.println(tree.age);
        }
    }

    // public static <T extends Comparable<T>> void bubbleSort(T[] array) {
    // int n = array.length;

    // for (int j = 0; j < n - 1; j++) {
    // for (int i = 0; i < n - j - 1; i++) {
    // if (array[i + 1].compareTo(array[i]) < 0) {
    // T temp = array[i];
    // array[i] = array[i + 1];
    // array[i + 1] = temp;
    // }
    // }
    // }
    // }
}
