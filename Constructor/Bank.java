class Bank {
    String holderName;
    int accountNumber;
    double balance;

    Bank(String holderName, int accountNumber, double balance) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void display() {
        System.out.println("Holder Name: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance = balance - amount;
            System.out.println("Withdrawn Amount: " + amount);
            System.out.println("Balance Amount: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited Amount: " + amount);
            System.out.println("Balance Amount: " + balance);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    public static void main(String[] args) {
        Bank b1 = new Bank("Aditya", 12345, 20000.50);
        Bank b2 = new Bank("Arjun", 12346, 30000.50);

        b1.display();
        b1.withdraw(5000);

        System.out.println();

        b2.display();
        b2.deposit(5000);
    }
}