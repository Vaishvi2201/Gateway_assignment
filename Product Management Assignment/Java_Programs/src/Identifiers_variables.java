import java.io.*;
import java.util.*;
public class Identifiers_variables {

	public static void main (String[] args) {

		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter integer number- ");
		int a= sc.nextInt();
		System.out.println("the value entered is integer="+a);
		
		
		Scanner sc1= new Scanner(System.in); 
		System.out.print("Enter double number- ");
		double a1= sc1.nextDouble();
		System.out.println("the value entered is double="+a1);
		
		
		Scanner sc2= new Scanner(System.in); 
		System.out.print("Enter String - ");
		String a2= sc2.nextLine();
		System.out.println("the value entered is string="+a2);
		
		Scanner sc3= new Scanner(System.in); 
		System.out.print("Enter boolean value- ");
		boolean a3= sc.nextBoolean();
		System.out.println("the value entered is boolean="+a3);
	}
}
