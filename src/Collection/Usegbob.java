package Collection;

import java.util.ArrayList;
import java.util.List;

public class Usegbob {
 public static void main(String[] args) {
	 List <gbob> list = new ArrayList<>();
    gbob b1 = new gbob(1,"bamdev","239");
    gbob b2 = new gbob(2,"hari","232323");
    
   list.add(b1);
   list.add(b2);
   for(gbob g:list) {
	   System.out.println(g.getId()+","+g.getName()+", "+g.getSal());
   }
}
} 
