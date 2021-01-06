import java.io.*;
import java.util.*;
public class While_loop {

	public static void main(String[] args) {
		int count=0;
		while(count<=50) {
			
			for(int i=1;i<=10;i++) {
				count=count+5;
			System.out.println("multiple of 5*"+i + "=" +count);
		}
		}
	}
}
