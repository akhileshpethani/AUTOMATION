package Assignment_6;
class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Code to be executed by the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
public class P017_Thread {
	  public static void main(String[] args) {
	        MyRunnable runnable = new MyRunnable();
	        Thread thread = new Thread(runnable); // Create thread object
	        thread.start(); // Start the thread

	        // Main thread work
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Main thread: " + i);
	            try {
	                Thread.sleep(500);
	            } catch (InterruptedException e) {
	                System.out.println("Main thread interrupted");
	            }
	        }
	    }

}
