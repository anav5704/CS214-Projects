public class Iterative {
    public static void main(String[] args) {
        int[] sizes = { 10, 20, 30 };
        // Passes: 10, 20, 30

        for (int n : sizes) {
            int a = 0, b = 1, counter = 0;

            for (int i = 0; i < n; i++) {
                counter++;
                int next = a + b;
                a = b;
                b = next;
            }

            System.out.println(counter);
        }
    }
}
