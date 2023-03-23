import java.util.*;
import java.lang.*;
class Item{
    int price;
    int quantity;
    String name;
    public Item(String name,int price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
class customer{
    Item[] items;
    public customer(Item[] items){
        this.items = items;
    }
}
class bill{
    public static int calculateTotal(Customer customer){
        int total =0;
        for(Item item : customer.items){
            total += item.price * item.quantity;
        }
        return total;
    }
}


public class cart {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String 
    }
}
