package MultiThreading;

public class SchedulingTest extends Thread {
	ThreadTest t = new ThreadTest();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("name: " + currentThread().getName());
		System.out.println("Priority: " + currentThread().getName());
	}

	public static void main(String[] args) {
		SchedulingTest t1 = new SchedulingTest();
		SchedulingTest t2 = new SchedulingTest();
		SchedulingTest t3 = new SchedulingTest();

		t1.setPriority(MIN_PRIORITY);
		t1.setPriority(MAX_PRIORITY);
		t1.setPriority(NORM_PRIORITY);
	}
}
