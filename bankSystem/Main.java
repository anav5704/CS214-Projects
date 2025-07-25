public class Main {
    public static void main(String[] args) {
        Account account = new Account("Anav", 100.00);

        account.deposit(50.25);
        account.displayInfo();
    }
}