// Java program to remove an element
// from a specific index from an array

import java.util.*;

public class p {

	public static void main(String[] args)
	{
        String s = "xyxyxy";
        String s1 = "xxyyxx";
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) !=s.charAt(i+2)){
                c++;
                break;
            }
        }
        if(c==1){
            System.out.println("present");
        }else{
            System.out.println("absent");
        }
		
	}
}
