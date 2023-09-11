package ClassObjectConcept;

public class UseBook {
public static void main(String[] args) {
	Book bk = new Book();
	bk.name ="Java";
	bk.pages = 460;
	bk.author = "James Gosling";
	bk.price = 1500;
	bk.printBookInfo();
	Book b1 = new Book();
	b1.author ="James Gosling";
	b1.name ="Core java";
	b1.pages =760;
	b1.price = 1800;
	b1.printBookInfo();
	}
}
