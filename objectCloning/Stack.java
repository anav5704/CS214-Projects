import java.util.Vector;
import java.util.EmptyStackException;

class Stack implements Cloneable {
    private Vector items;

    public Stack() {
        items = new Vector();
    }

    public Object push(Object item) {
        items.addElement(item);
        return item;
    }

    public Object pop() {
        Object obj;
        int len = items.size();
        obj = peek();
        items.removeElementAt(len - 1);
        return obj;
    }

    public Object peek() {
        int len = items.size();
        if (len == 0)
            throw new EmptyStackException();
        return items.elementAt(len - 1);
    }

    public int size() {
        return items.size();
    }

    public String toString() {
        return items.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Shallow clone
        // return super.clone();

        // Deep clone
        Stack clonedStack = (Stack) super.clone();
        clonedStack.items = (Vector) items.clone();
        return clonedStack;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        // Stack s1 = new Stack();

        // s1.push(11);
        // s1.push(25);
        // s1.push(89);

        // Stack s1Clone = (Stack) s1.clone();

        // System.out.println(s1);
        // System.out.println(s1Clone);

        Stack s2 = new Stack();

        s2.push("I");
        s2.push("Love");

        Stack s2Clone = (Stack) s2.clone();

        System.out.println(s2);
        System.out.println(s2Clone);

        s2.push("CS214");

        System.out.println(s2);
        System.out.println(s2Clone);

        s2Clone.push("Java");

        System.out.println(s2);
        System.out.println(s2Clone);
    }
}