import java.io.*;
import java.util.*;
import java.math.*;

public class StaticInitializer{

	static int a;
	static int b;
	static boolean flag;
	static {
	
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if(a<=0||b<i=0){
			flag=false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}else{
		
			flag =true;
		}
	
	}
	public static void main(String[] args){
	
		
		if(flag){
			
			int area = a*b;
			System.out.println(area);
		
		}
	
	}

}
