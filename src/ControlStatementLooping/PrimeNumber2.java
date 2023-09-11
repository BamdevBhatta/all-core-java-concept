package ControlStatementLooping;

public class PrimeNumber2 {
public static void main(String[] args) {
	int i =0;
    int num =0;
    //Empty String
    String  primeNumbers = "";

    for (i = 100; i <= 200; i++)         
    { 		  	  
       int counter=0; 	  
       for(num =i; num>=1; num--)
	  {
          if(i%num==0)
	     {
		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     primeNumbers = primeNumbers + i + " ";
	  }	
    }	
    System.out.println("Prime numbers from 100 to 200 are :");
    System.out.println(primeNumbers);
}
}
