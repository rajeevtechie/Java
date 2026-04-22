public class CountdownThread extends Thread {
    
    @Override
    public void run() {
        System.out.println("Countdown Started:");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
            try {
                // Halts the thread execution for 1000 milliseconds (1 second)
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
        System.out.println("Countdown Finished!");
    }

    public static void main(String[] args) {
        // Create and start the thread
        CountdownThread thread = new CountdownThread();
        thread.start(); 
    }
}