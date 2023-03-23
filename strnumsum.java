import java.util.*;
public class strnumsum {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);  
    String s = sc.nextLine();
    char [] charArr = s.toCharArray();
    int sum = 0;
    for (int i = 0; i < charArr.length;) {
        int num= 0;
        while(i<charArr.length && Character.isDigit(charArr[i])){
            int thisNum = Character.getNumericValue(charArr[i]);
            num = num*10 + thisNum;
            i++; 
        }
        sum += num;
        i++;
    }
    System.out.println(sum);
    }
}
