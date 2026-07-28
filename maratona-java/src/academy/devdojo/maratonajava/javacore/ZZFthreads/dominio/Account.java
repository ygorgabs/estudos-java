package academy.devdojo.maratonajava.javacore.ZZFthreads.dominio;

public class Account {

    private double balance = 50;

    public void withdrawal(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
