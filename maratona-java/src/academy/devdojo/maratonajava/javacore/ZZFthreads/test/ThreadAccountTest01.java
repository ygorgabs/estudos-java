package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTest01  implements Runnable{
    private Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 accountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(accountTest01, "Inuyasha");
        Thread t2 = new Thread(accountTest01, "Agome");

        t1.start();
        t2.start();
    }

    private void withdrawal(double amount) {
        if (account.getBalance() >= amount) {
            System.out.println(getThreadName() + " sacando valor...");
            account.withdrawal(amount);
            System.out.println("Saldo atualizado: " + account.getBalance());
        } else {
            System.out.println("Saldo insuficiente para " + getThreadName() + ". Valor disponível: " + account.getBalance());
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if(account.getBalance() < 0) System.out.println("Deu errado");
        }
    }
}
