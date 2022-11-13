package accounting;

public class Account {

    private int number;
    private int balance;

    public Account() {
    }

    public Account(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " [" + this.number + ", " + this.balance + "]";
    }
}
