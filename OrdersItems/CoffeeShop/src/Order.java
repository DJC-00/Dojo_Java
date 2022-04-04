import javafx.scene.layout.BorderStroke;

import java.util.ArrayList;

public class Order {
    String name;
    Float total;
    Boolean ready;
    ArrayList<Item> items;

    public Order(String orderName, ArrayList<Item> order){
        name = orderName;
        items = order;
        total = Order.getTotal(order);
        ready = false;
    }

    public String toString(){
        String itemStr = "";
        String tString = String.format("$%.2f",total);
        String statusString = "";
        for (int i = 0; i < this.items.size(); i++){
            Item tempItem = this.items.get(i);
            itemStr += tempItem.name;
            if(i != this.items.size()-1){
                itemStr += ", ";
            }
            else{
                itemStr += ".";
            }
        if (this.ready == false){
            statusString = "Not ready.. Please wait";
        }   
        else{
            statusString = "Order Up!";
        }
        } 
        return("Name: " + this.name + "\nItems: " + itemStr + "\nTotal: " + tString + "\nStatus: " + statusString);
    }

    public static Float getTotal(ArrayList<Item> itemList){
        Float total = 0.00f;
        for (int i = 0; i < itemList.size(); i++){
            Item item = itemList.get(i);
            total += item.price;
        }
        return total;
    }

    public void waitOnOrder() {
        System.out.println("<><><> Waiting <><><>");
        if (this.ready == false){
            this.ready = true;
            System.out.println("Order for " + this.name + " is Ready!");
        }
        else{
            System.out.println(this.name + " your coffee is getting cold!");
        }
        
    }

    
}

