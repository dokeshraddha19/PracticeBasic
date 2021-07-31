package programs;
import java.util.*;
public class powerof2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		double power=0;
		System.out.println("Enter Powers");
		n=sc.nextInt();
		sc.close();
		for(i=0;i<=n;i++) {
			power=Math.pow(2,i);
			System.out.println(+power);

		}
		

	}

}
