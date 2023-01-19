/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    //Declared Scanner
	    Scanner scan = new Scanner (System.in);
	    
	    //Declared Variables
	    int num;
	    int temp = 5;
	    
	    //Input & output Screen
	    while (temp > 0) {
	        int factorial = 1;
	        System.out.print("Enter a Positive Number: ");
	        num = scan.nextInt();
	        System.out.print(num + "!= ");
	        
	        if (num > 0) {
	            for (int i = 1; i <= num; i++) {
	                System.out.print(i);
	                factorial *= i;
	                if (i < num) 
	                System.out.print("*");
	            }
	            System.out.println("\n The Factorial of the " + num + " is: " + factorial);
	        }
	        else if (num < 0) {
	            System.out.println("Invalid Input! Programm Stopped!");
	            break;
	        }
	        temp--;
	    }
	}
}


