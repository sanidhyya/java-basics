import java.util.Scanner;

public class gcd{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1= sc.nextInt();
    int n2= sc.nextInt();
   int on1 =n1;
   int on2 =n2;

    while(n1%n2!=0){
        int rem = n1%n2;
        n1=n2;
        n2=rem;
    }
    int gcd=n2;
    int lcm =(on1*on2)/gcd;
    System.out.println(gcd);
    System.out.println(lcm);
  }
}

// import java.util.Scanner;
// public class gcd{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         char ab = sc.next().charAt(0);
//         if(ab=='a'|| ab=='e'|| ab=='i'||ab=='o'|| ab=='u'|| ab=='A'|| ab=='E'|| ab=='I'||ab=='O'|| ab=='U')
//         System.out.println("this is vowel");
//         else
//         {
//             System.out.println("this is constant");
//         }
//     }
// }
