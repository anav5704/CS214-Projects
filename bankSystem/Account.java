class Account {
    private String owner;
    private double balance;

    public Account(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void displayInfo() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        this.balance += amount;
        applyFee();
    }

    private void applyFee() {
        this.balance -= 1;
    }
}