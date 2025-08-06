import java.util.Arrays;

public class Recursive {
    public static int fibonacci(int n, int[] counter) {
        counter[0]++;

        if (n <= 1) return n;

        return fibonacci(n - 1, counter) + fibonacci(n - 2, counter);
    }  

    public static void main(String[] args) {
        int[] sizes = {10, 20, 30};
        // Passes: 177, 21891, 2692537

        for(int n: sizes) {
            int[] counter = {0};

            fibonacci(n, counter);

            System.out.println(Arrays.toString(counter));
        }
    }
}
