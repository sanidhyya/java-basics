import java.util.*;
import java.io.*;
class cbse1{
    public static void main(String[] args) {
        TreeMap<Integer,String> p1 = new TreeMap<Integer,String>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num!=0){
            int mark = sc.nextInt();
            String name = sc.nextLine();
            p1.put(mark,name);
            num--;
        }
        NavigableMap<Integer,String> Rank = p1.descendingMap();
        System.out.println("The ranks based on gtheir marks: ");
        int count =0;
        for(NavigableMap.Entry<Integer,String> entry:Rank.entrySet()){
            count++;
            String str = Integer.toString(count);
            System.out.println("Rank " +count+ ": "+entry.getValue());
        }
    }
}