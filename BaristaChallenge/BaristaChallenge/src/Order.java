import javafx.scene.layout.BorderStroke;

import java.util.ArrayList;

public class Order {
    private String name;
    private Float total;
    private Boolean ready;
    private ArrayList<Item> items;

    public Order(){
        name = "Guest";
        items = new ArrayList<Item>();
        total = 0f;
        ready = false;
    }

    public Order(String orderName){
        name = orderName;
        items = new ArrayList<Item>();
        total = 0f;
        ready = false;
    }

    public Order(String orderName, ArrayList<Item> order){
        name = orderName;
        items = order;
        total = this.getTotal();
        ready = false;
    }

//===========================================
//   toString Overload
//===========================================

    public String toString(){
        String itemStr = this.getItems();
        String tString = String.format("$%.2f",total);
        String statusString = "";
        if (this.ready == false){
            statusString = "Not ready.. Please wait";
        }   
        else{
            statusString = "Order Up!";
        }
        
        return("Name: " + this.name + "\nItems: " + itemStr + "\nTotal: " + tString + "\nStatus: " + statusString);
    }
//===========================================
//   Get and Set name
//===========================================
    public String getName(){
        return this.name;
    }

    public String setName(String newName){
        return this.name;
    }

//===========================================
//   Get and Set total
//===========================================

    // public Float getTotal(){
    //     return this.total;
    // }

    public Float getTotal(){
        Float total = 0.00f;
        for (int i = 0; i < items.size(); i++){
            Item item = items.get(i);
            total += item.getPrice();
        }
        return total;
    }

    public Float setTotal(Float amt){
        this.total = amt;
        if (this.total < 0f){
            this.total = 0f;
        }
        return this.total;
    }

    public Float setTotal(String opp, Float amt){
        if (opp == "+"){
            this.total += amt;
        }
        else if (opp == "-"){
            this.total -= amt;
        }
        else if  (opp == "="){
            this.total += amt;
        }
        else{
            System.out.println("Invalid Opperator Given");
        }
        if (this.total < 0f){
            this.total = 0f;
        }
        return this.total;
    }

//===========================================
//   Get and Set items
//===========================================
    public String getItems(){
        String itemStr = "";
        for (int i = 0; i < this.items.size(); i++){
            Item tempItem = this.items.get(i);
            itemStr += tempItem.getName();
            if(i != this.items.size()-1){
                itemStr += ", ";
            }
            else{
                itemStr += ".";
            }
        }
        return itemStr;
    }

    public void addItem(Item newItem){
        this.items.add(newItem);
        this.total = this.getTotal();
    }

    public void delItem(Item newItem){
        for (int i = 0; i < this.items.size(); i++){
            Item tempItem = this.items.get(i);
            if (tempItem.equals(newItem)){
                this.items.remove(i);
                break;
            }
        }
        this.total = this.getTotal();
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

