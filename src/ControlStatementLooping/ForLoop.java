package ControlStatementLooping;

public class ForLoop {
public static void main(String[] args) {
	int sum=0;
	int sum1=0;
	 int sum2=0;
	for(int i=1;i<=100;i++) {
		if(i%2==0) 
			sum1=sum1+i;
		else 
			
		
		sum2=sum2+i;
	}
	System.out.println("sum of even :"+sum1);
	System.out.println("sum if odd:"+sum2);
}
}
