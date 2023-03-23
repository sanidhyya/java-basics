import java.util.*;
public class kth_digit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        String str = sc.next();
        System.out.println("enter the kth number");
        int k = sc.nextInt();
        int sum=0;
        if(k>str.length()){
            System.out.println("-1");
        }
        else{
        for(int i=0;i<str.length();i++){
            if((i+1)%k==0){
                sum += Integer.parseInt(String.valueOf(str.charAt(i))); 
            }
        }
        System.out.println(sum);
    }
    }
}
