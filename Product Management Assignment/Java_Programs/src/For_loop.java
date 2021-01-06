import java.io.*;
import java.util.*;
public class For_loop {

	public static void main(String []args) {
		int i;
		for(i=1;i<=5;i++) {
			System.out.println("Gateway printed "+i); //executes a particular statement for multiple times
			if(i==6) {
				break;
			}
			else {
				continue;
			}
			
		}
	}
}
