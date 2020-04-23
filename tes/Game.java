public class Game {
    private int playerCount;

    public Game() {
        this.playerCount = 0;  
    }

    public synchronized void onPlayerJoin() {
        int prevPlayerCount = this.playerCount;
        this.playerCount = prevPlayerCount + 1;
    }
    public synchronized void start() {
        // for (int i = 0; i < 10; i++) {
        //     // Misalnya, proses untuk player join butuh waktu lama  
        //     try {
        //         Thread.sleep(2000);
        //         this.onPlayerJoin();      
        //     } catch (Exception e) {
        //         System.out.println(e);
        //     }    
        // }  
        while (this.playerCount < 10) {
            // busy waiting
        }    
        System.out.println("starting game!");  
    }
}