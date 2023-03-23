import java.util.*;
public class bst
{

    public class TreeNode 
    {
        int data; 
        /// 2 nodes with datatype as TreeNode.
        TreeNode left;
        TreeNode right;
        TreeNode(int data) //constructor to initialize the members 
        {
            this.data = data;
            this.left = this.right = null; //initially tree is empty
        }
    }

    TreeNode root; 
    bst()
    {
        root = null;
    }
    // making of tree (initializing tree)
    public TreeNode insert (TreeNode root,int dataToBeInserted)
    {
        if (root == null) 
        {
            root = new TreeNode(dataToBeInserted);
            return root;
        }
         if(root.data>dataToBeInserted)
         {
            root.left = insert(root.left, dataToBeInserted);
         }
         else if(root.data < dataToBeInserted){
            root.right = insert(root.right, dataToBeInserted);
         }
         return root;
    }


    public TreeNode search(TreeNode root , int dataToBeSearched)
    {
        if(root == null || root.data == dataToBeSearched)
        return root;

        else if(root.data > dataToBeSearched)
        {
            return search(root.left,dataToBeSearched);
        }
        else if(root.data < dataToBeSearched)
        {
            return search(root.right, dataToBeSearched);
        }
    }

    public void inOrder(TreeNode root)
    {
        if(root==null)
        return;
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }

    public void preOrder(TreeNode root)
    {
        if(root==null)
        return;
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(TreeNode root)
    { 
        if(root==null)
        return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data+" ");
    }


    public void insertIntoTree(int dataToBeInserted)
    {
        root = insert(root, dataToBeInserted);
    }

    public TreeNode searchTree(int dataToBeSearched)
    {
        return search (root, dataToBeSearched);
    }

    public void inOrderTraversal()
    {
        inOrder(root); 
    }
    public void postOrderTraversal()
    {
        postOrder(root); 
    }
    public void preOrderTraversal()
    {
        preOrder(root); 
    }

    public static void main(String [] args){
        bst bst1 = new bst();
        int n ,num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many  numbers u want to input");
        n =sc.nextInt();
        System.out.println("enter"+n+ "numbers : ");
        for(int i =0;i<n;i++)
        {
            num =sc.nextInt();
            bst1.insertIntoTree(num);
        }

        System.out.println("enter the number to be searched");
        n=sc.nextInt();
        if(bst1.searchTree(n) != null){
            System.out.println("number is there");
        }else{
            System.out.println("not found");
        }
        bst1.inOrderTraversal();
        System.out.println();
        bst1.preOrderTraversal();
        System.out..println();
        bst1.postOrderTraversal();
    }
}