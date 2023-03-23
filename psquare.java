import java.util.Scanner;

public class psquare {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        for (int i = 1; i <=num; i++) {
            if(i*i==num){
                System.out.println("the number"+num+" is a perfect square and its sqrt is"+i+"");
                return;
            }
        }
    }
}