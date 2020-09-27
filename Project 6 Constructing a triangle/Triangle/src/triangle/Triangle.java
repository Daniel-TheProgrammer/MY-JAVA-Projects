/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

/**
 *
 * @author Bluelime Learning So
 */
import java.io.*;
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{        
            BufferedReader object = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("enter the number");
	    int a= Integer.parseInt(object.readLine());
	    for (int i=1; i<a;i++ ){
	        for (int j=1; j<=i;j++ ){
	             System.out.print("*");
            }
	    System.out.println("");
	}
                
    }
      catch(Exception e){}
    }
    
}
