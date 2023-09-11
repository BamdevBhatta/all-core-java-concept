package Collection;

interface Shape {
	void draw(int a, int b);
}

//class ShapeImpl implements Shape {
//
////	@Override
////	public void draw() {
////		// TODO Auto-generated method stub
////		System.out.println("Draw Shape");
////	}
////
////}

public class LamdaDocs {
public static void main(String[] args) {
//	//this is old technique
//	//====using impl class========
//	Shape s = new ShapeImpl();
//	s.draw();
//	//this is same as above
//	//======= using Anonymous class
//	Shape sh = new Shape() {
//
//		@Override
//		public void draw() {
//			System.out.println("Draw class");
//		}
//	};
//	sh.draw();
	//======using lambda Expression===
//	Shape sp = () ->{
//		System.out.println("Draw Triangle");
//	};
//	sp.draw();
	Shape sp = (a,b) ->{
		System.out.println("Draw Triangle= "+(a+b));
	};
	sp.draw(20,30);
	}
}



