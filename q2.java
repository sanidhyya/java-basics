import java.util.Scanner;

public class q2 {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int Sum = 0 ;
		sc = new Scanner(System.in);		
		System.out.println("\n Please Enter any Number: ");
		int Number = sc.nextInt();

		for(int i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == Number) {
			System.out.format("\n% d is a Perfect Number", Number);
		}
		else {
			System.out.format("\n% d is NOT a Perfect Number", Number);
		}
	}
}