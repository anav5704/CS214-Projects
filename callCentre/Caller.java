public class Caller {
    private String name;
    private String message;
    private long phone;

    public Caller(long phone) {
        this.phone = phone;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Message: " + message);
        System.out.println("Phone: " + phone);
    }

    public void hangUp(String name, String message) {
        this.name = name;
        this.message = message;
    }
}

