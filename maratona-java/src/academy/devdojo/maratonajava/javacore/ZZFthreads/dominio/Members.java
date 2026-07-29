package academy.devdojo.maratonajava.javacore.ZZFthreads.dominio;

import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails(){
        synchronized (emails){
            return emails.size();
        }
    }

    public void addMemberEmail(String email){
        synchronized (this.emails){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " adicionou email a lista");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " check if there are emails");
        synchronized (emails){
            while (this.emails.isEmpty()){
                if(!open) return null;
                System.out.println(Thread.currentThread().getName() + " Não ha emails. Entrando em modo de espera");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void close(){
        open = false;
        synchronized (emails){
            System.out.println(Thread.currentThread().getName() + " Notificando todos que  não procuramos mais emails");
            emails.notifyAll();
        }
    }
}
