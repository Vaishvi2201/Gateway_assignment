import java.io.*;
import java.util.*;
public class Constructor {
	 	int id;  
	    String name;  
	    //creating a parameterized constructor  
	    Constructor(int i,String n){  
	    id = i;  
	    name = n;  
	    }
	    void display(){
	    	System.out.println(id+" "+name);
	    
	    }
	    
	    public static void main(String args[]){  
	        //creating objects and passing values  
	    	System.out.println("Enter your id=");
	    	Scanner sc= new Scanner(System.in);
	    	int id1=sc.nextInt();
	    	
	    	System.out.println("Enter your name=");
	    	Scanner sc1= new Scanner(System.in);
	    	String str1=sc1.nextLine();
	    	
	       Constructor s1 = new Constructor(id1,str1);  
	        
	        //calling method to display the values of object  
	        s1.display();  
	       
	    }  
}
