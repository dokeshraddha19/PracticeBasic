package programs;
import java.util.*;
public class flipcoin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,coin=0,a=0,b=0;
		System.out.println("number of times flip coin");
		n=sc.nextInt();
		sc.close();
		for(i=1;i<=n;i++) {
			coin= (int)Math.floor(Math.random())% 2;
		   if(coin<0.5) {
			    System.out.println("Head");
			    a++;
		   }
		  else {
			System.out.println("Tail");
			b++;
		  }
		   double percentage=(float)(a/b)*100;
			System.out.println(+percentage);
		   
		}
		
	}

}
