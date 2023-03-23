import java.util.*;
public class calc {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Addition-a: Subtraction-s: Multiplication-m: Division-d: ");
            char ch = sc.next().charAt(0);
            switch(ch){
                case 'a':
                System.out.println("The addition of the two number is:"+(a+b));
                break;
                case 's':
                System.out.println("The sub of the two number is:"+(a-b));
                break;
                case 'm':
                System.out.println("The mul of the two number is:"+(a*b));
                break;
                case 'd':
                System.out.println("The div of the two number is:"+(a/b));
                break;
                default :
                System.out.println("invalid");
            }
        }    
}
