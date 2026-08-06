package concurrency;

public class PingPongGame {

    private boolean isPintTurn = true;

    public synchronized void playPing() throws InterruptedException {

        while(!isPintTurn){ wait();}
        isPintTurn = false;
        System.out.println("Ping");
        notify();
    }

    public synchronized void playPong() throws InterruptedException {
        while(isPintTurn){ wait();}
        isPintTurn = true;
        System.out.println("Pong");
        notify();
    }

    public static void main(String[] args) throws InterruptedException {
        PingPongGame game = new PingPongGame();

        Thread pingPlayer = new Thread(new PingPlayer(game));
        Thread pongPlayer = new Thread(new PongPlayer(game));

        pingPlayer.start();
        pongPlayer.start();

        pingPlayer.join();
        pongPlayer.join();
    }
}
