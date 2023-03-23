import java.util.*;
import java.lang.*;
import java.io.*;
public class bracketcount {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<>();
        int t = sc.nextInt();
        if(t<=0){
            System.out.println("Enter valid number");
        }    
        while (t-- > 0){
            int pos=0;
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='('){
                    System.out.println(++pos +" ");
                    st.push(pos);
                }
                else if(s.charAt(i)==')'){
                    System.out.println(st.peek()+" ");
                    st.pop();
                }
            }
            System.out.println();
           
        }
    }    
}
