import java.io.*;
import java.util.*;
public class Decision_making {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter number1= ");
		int num1= sc.nextInt();
		
		Scanner sc1= new Scanner(System.in); 
		System.out.print("Enter number2= ");
		int num2= sc1.nextInt();
		
		if(num1>num2) 
		{
			System.out.println("num1 greater than num2");
		}
		
		else if(num1==num2)
		{
			System.out.println("num1 equal to num2");
		}
		
		else {
			System.out.println("num2 greater than num1");
		}
		
		
		Scanner sc2= new Scanner(System.in); 
		System.out.print("Enter day number= ");
		int iDay =sc2.nextInt();
		 
		 switch(iDay){
		 case 1:
		 System.out.println("Today is Monday");
		 break;
		 case 3:
		 System.out.println("Today is Tuesday");
		 break;
		 case 4:
		 System.out.println("Today is Wednesday");
		 break;
		 case 5:
		 System.out.println("Today is Thursday");
		 break;
		 case 6:
		 System.out.println("Today is Friday");
		 break;
		 case 7:
		 System.out.println("Today is Saturday");
		 break;
		 default:
		 System.out.println("Today is Sunday");
		 break;
		 }
		 
	}
}
