class Pet implements Cloneable {
    public String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "name: " + name;
    }
}

class User implements Cloneable {
    public String name;
    public Pet pet;

    public User(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Shallow clone
        // return super.clone();

        // Deep clone
        User c = (User) super.clone();
        c.pet = (Pet) pet.clone();
        return c;
    }

    @Override
    public String toString() {
        return "name: " + name + " pet name:" + pet.name;
    }

}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pet p = new Pet("Pet");

        User u = new User("User", p);
        User c = (User) u.clone();

        System.err.println(u);
        System.err.println(c);

        p.name = "New";

        System.err.println(u);
        System.err.println(c);
    }
}
