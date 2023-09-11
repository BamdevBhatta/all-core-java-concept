package MultiThreading;

public class Test {
	public static void main(String[] args) {
		FacobookPage photo = new FacobookPage(1200);

		for (int i = 1; i <= 10; i++) {
			Thread user1 = new Thread() {
				//@Override
				public void run() {
					
					photo.doLike();
				}
			};
			user1.start();
		}

	}
}
