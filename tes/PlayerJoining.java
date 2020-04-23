public class PlayerJoining extends Thread {
    private OnPlayerJoiningListener listener;
    public PlayerJoining(OnPlayerJoiningListener listener) {
        this.listener = listener;   
    }
    public void run() {
        // Misalnya, proses untuk player join butuh waktu lama       
        try {
            Thread.sleep(2000);       
            listener.onPlayerJoin();   
        } catch (Exception e) {
            System.out.println(e);
        }
    } 
    public interface OnPlayerJoiningListener {
        void onPlayerJoin();   
    }
}