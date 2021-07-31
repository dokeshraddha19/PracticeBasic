package programs;
import java.util.*;
public class vowelconsonant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Take a Character");
		 char c = sc.next().charAt(0);
		 sc.close();
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("The word is Vowel");
		}
		else {
			System.out.println("The word is Consonant");
		}
	}

}
