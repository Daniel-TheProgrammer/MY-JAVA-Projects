/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestnumber;

/**
 *
 * @author Bluelime Learning So
 */
public class LargestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int x=507, y=77, z=5000;
		if (x>y){
			if (x>z){
				System.out.println("x is greater");
			}
			else{
				if(z>y){
					System.out.println("z is greater"); 
				}
				else{
					System.out.println("y is greater");
				}
			}
		}
		else{
			if (y>z){
				System.out.println("y is greater");
			}
		}
	}
}