package JavaString;

public class SplitTestDemo {
public static void main(String[] args) {
	int cnt=0;
		String s = "java developers in nepal ";
		 String[] words = s.split(" ");// we also represent space as'\\s'()
		 for(String w: words) {
			 System.out.println(w);
			 if(w.equalsIgnoreCase("java"));
			 cnt++;


		 }
		 System.out.print("Total: "+cnt);
	}
}
