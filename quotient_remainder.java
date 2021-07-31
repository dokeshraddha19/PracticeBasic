package programs;
import java.util.*;
public class quotient_remainder {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		n=sc.nextInt();
		sc.close();
		int Quotient=n/10;
		System.out.println("Quotient="+Quotient);
		int Remainder=n%10;
		System.out.println("Remainder="+Remainder);
	}

}
