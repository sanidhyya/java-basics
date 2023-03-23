import java.util.*;
public class tobinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = Integer.toBinaryString(num);
        System.out.println(str);
        int num1 = Integer.parseInt(str);
        int count=0 ,rem;
        for (int i = 0; i < num1;) {
            rem = num1%10;
            if(rem==1){
                count++;
            }
            num1=num1/10;
        }
        System.out.println(count);
    }
}


