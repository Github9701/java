package threads;

public class ThreadDemoMain {

	public static void main(String[] args) {
		
		ThreadDemo t1 = new ThreadDemo("Thread-1");
		ThreadDemo t2 = new ThreadDemo("Thread-2");
		ThreadDemo t3 = new ThreadDemo("Thread-3");
		ThreadDemo t4 = new ThreadDemo("Thread-4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("Main Thread Start");
		
		System.out.println("Main Thread End");

	}

}
