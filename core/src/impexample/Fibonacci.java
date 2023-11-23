package impexample;
import java.util.*;

public class Fibonacci {
//write program for fibonacci series
	public static void main(String[] args) {
	//	n=n+n-1 0+1=1,1+1=2,1+2=3
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number n");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		
		if(n<0) {
			System.out.println("N can not negative");
		}
	if(n==0)
			System.out.println(a);
		else if(n==1)
			System.out.println(b);
		else {
			int c=0;
			for(int i=0;i<n;i++) {
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println(c);
		}
	}
}
