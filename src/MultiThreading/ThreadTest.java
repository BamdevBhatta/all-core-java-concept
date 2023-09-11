package MultiThreading;

public class ThreadTest extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("From Thread");
	}
	public static void main(String[] args) {
			ThreadTest t = new ThreadTest();
			t.start();
			System.out.println("Main Thread");
	}
}
