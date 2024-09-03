package threads;

public class ThreadDemo extends Thread {
	
	private Thread t;
	private String threadName;
	public ThreadDemo(String threadName) {
		super();
		this.threadName = threadName;
	}
	@Override
	public void run() {
		System.out.println("Running " + threadName);
		
		try {
			
			for(int i=4;i>0;i--) {
				System.out.println("thread " + threadName + "," + i);
				Thread.sleep(50);
			}
		} catch(InterruptedException e) {
			System.out.println("Thread " + threadName + " Interrupted");
			
		}
		
		System.out.println("Thread " + threadName + " Exited");
	}
	
	

}
