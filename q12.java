import java.util.Scanner;
public class q12 {
	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.print("Please enter your age:- ");
		try {
			int n = s1.nextInt();


			if (n < 15) {
				System.out.println("Welcome to carnival of Terror .\n children should have an adult with them.");
			} else {
				System.out.println("Welcome to carnival of Terror ");
			}
		} catch (Exception e) {
			System.out.println("You have entered a wrong age");
		}
	}
}