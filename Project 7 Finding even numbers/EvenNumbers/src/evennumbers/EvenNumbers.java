/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evennumbers;

/**
 *
 * @author Bluelime Learning So
 */
import java.io.*;
public class EvenNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number : ");
		int num = Integer.parseInt(br1.readLine());
		System.out.println("Even Numbers:");
		for (int i=1;i <=num ; i++){
		         if(i%2==0 ){
					System.out.print(i+",");
				}
			}
		}
		catch(Exception e){}
        
    }
    
}
