package randomnumbers;
import java.util.*;


public class RandomNumbers {

  
    public static void main(String[] args) {
        int counter;
        Random rnum = new Random();
        for (counter =1; counter <=7;counter++) {
          System.out.println(rnum.nextInt(270));
        
        }
     
    }
    
}
