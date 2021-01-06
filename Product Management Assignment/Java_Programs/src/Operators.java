import java.util.*;
import java.io.*;
public class Operators {
	public static void main(String[] args) {
		int num1=20; //assignment operator
		int num2=30;
		int add=num1+num2; //arithmetic(addition)
		int sub=num1-num2; //arithmetic(subtraction)
		num1++; //increment operator
		num2--;//decrement operator
		boolean Output_1 = true;
		boolean Output_2 = false;
		 
		if(num1>num2) //relational(greater than) 
		{
			System.out.println("num1 greater than num2");
		}
		
		else if(num1==num2) //relational(equal to) 
		{
			System.out.println("num1 equal to num2");
		}
		
		else {
			System.out.println("num2 greater than num1");
		}
		System.out.println("addition="+add);
		System.out.println("subtraction="+sub);
		System.out.println("after increment="+num1);
		System.out.println("after decrement="+num2);
		System.out.println("Check if both the boolean variables are true : " + (Output_1 && Output_2));//logical(and operator)
		System.out.println("Check if even one of the boolean varibale is true : " + (Output_1 || Output_2));//logical(or operator)
		System.out.println("Change the state of the Output_1 to false : " + (!Output_1));
	}
}
