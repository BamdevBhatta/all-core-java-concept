package Abstraction;
//when we have only one method in  interface then we can called  functional interface.
//for creating functional interface we use
@FunctionalInterface
public interface CommonService {
	void print();
	//if we want to implement more than one method in functional inteface than.
	 static void sum() {
	}
	 default void check() {
		 
	 }

}
