import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static String reverseString(String string) {
        char[] array = string.toCharArray();
        int first = 0, last = array.length - 1;
        String reversed = "";

        while (first < last) {
            char temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first++;
            last--;
        }

        for (char letter : array) {
            reversed += letter;
        }

        return reversed;
    }

    public static String reverseLinkedList(String string) {
        LinkedList<Character> list = new LinkedList<Character>();
        String reversed = "";

        for (char letter : string.toCharArray()) {
            list.add(letter);
        }

        Collections.reverse(list);

        while (!list.isEmpty()) {
            reversed += list.remove();
        }

        return reversed;
    }

    public static String reverseStack(String string) {
        Stack<Character> stack = new Stack<Character>();
        String reversed = "";

        for (char letter : string.toCharArray()) {
            stack.push(letter);
        }

        while (!stack.empty()) {
            reversed += stack.pop();
        }

        return reversed;
    }

    public static String reverseQueue(String string) {
        Queue<Character> queue = new LinkedList<Character>();
        Stack<Character> stack = new Stack<Character>();
        String reversed = "";

        for (char letter : string.toCharArray()) {
            queue.add(letter);
        }

        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return reversed;

    }

    public static void main(String[] args) {
        String string = "Hello World";

        System.out.println(reverseString(string));
        System.out.println(reverseLinkedList(string));
        System.out.println(reverseStack(string));
        System.out.println(reverseQueue(string));
    }
}