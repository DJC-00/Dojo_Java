import java.util.ArrayList;
import java.util.Scanner;

public class Item {
    private String name;
    private Float price;
    private int index;
    private static ArrayList<Item> menu = new ArrayList<Item>();
    public Item(){
        
        name = getItemName();
        price = getItemPrice();
        index = menu.size()+1;
        menu.add(this);
    };

    public Item(String givenName, Float givenPrice){
        name = givenName;
        price = givenPrice;
        index = menu.size()+1;
        menu.add(this);
    };

    public String getName() {
        return this.name;
    };

    public Float getPrice(){
        return this.price;
    }

    public static void getMenu() {
        for (int i = 0; i < menu.size(); i++){
            Item temp = menu.get(i);
            String  price = String.format("$%.2f",temp.price);
            System.out.println("Item # " + temp.index + ", Item: " + temp.name + ", Price: " + price);
        }
    };

    public static int getMenuSize() {
        return menu.size();
    };

    public static Item getMenuItem(int index) {
        Item temp = menu.get(index);
        return temp;
    };

    private String getItemName(){
        System.out.println("Creating New Item:");
        System.out.println("Name: ");
        String newName = System.console().readLine();
        return newName;
    };

    private Float getItemPrice(){
        System.out.println("Price: ");
        Float newPrice;
        Scanner input = new Scanner(System.in);
        newPrice = input.nextFloat();
        input.close();
        return newPrice;
    }
}
