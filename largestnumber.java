package programs;
import java.util.*;
public class largestnumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp,ans;
		int x;
		System.out.println("Enter a number");
		x=sc.nextInt();
		int y;
		System.out.println("Enter b number");
		y=sc.nextInt();
		int z;
		System.out.println("Enter c number");
		z=sc.nextInt();
		sc.close();
		temp=x>y?x:y;
		ans=temp>z?temp:z;
		System.out.println("The largest number="+ans);
		
	}

}
