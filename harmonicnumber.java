package programs;
import java.util.*;
public class harmonicnumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N,i;
		double sum=0.0,H;
		System.out.println("Enter a number");
		N=sc.nextInt();
		sc.close();
		for(i=1;i<=N;i++) {
			H=(float)1/i;
		    sum+=H;
			
		}
		System.out.println(+sum);
	}

}
