import java.util.*;
import java.io.*;
 
public class Tree{
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
    }

    // method to create tree and return node
     Node createTree(){
        Node root = null;
        System.out.println("enter data:");
        int data = sc.nextInt();
        if(data=-1) return null;
        root = new Node(data); 
    }
}

class Node {
       Node left, right;
       int data;

       public Node (int data){
        this.data=data;
       }
}
