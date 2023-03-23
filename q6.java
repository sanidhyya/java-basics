import java.util.*;
class q6
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        String str=ob.nextLine();
       // StringTokenizer str1=new StringTokenizer(str," ");
        //int k=str1.countTokens();
        //System.out.println(k);
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                c++;
            }
        }
        System.out.println(c+1);
            
        }
    }