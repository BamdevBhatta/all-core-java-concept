package MultiThreading;

public class FacobookPage {
//Synchronisation is used for managing processes.

	private Integer like = 0;

	public FacobookPage(int like) {
		this.like = like;
	}

	public  synchronized void doLike() {
		like++;
		System.out.println("Like : " + like);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
