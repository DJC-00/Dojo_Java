import java.util.Scanner;
public class Barrista {
    
    public static Order getSomeCoffee(){
        System.out.println("Please enter a name for the order: ");
        String newName = System.console().readLine();
        Order newOrder = new Order();
        if (newName.length() > 0){
            newOrder.setName(newName);
        }
        Item.getMenu();
        Integer menuSelect = 1;
        while (menuSelect != 0){
            System.out.println("Select the Item number of each item you would like to order: ");
            Scanner input = new Scanner(System.in);
            menuSelect = input.nextInt();
            if(menuSelect == 0){
                input.close();
            }
            else if (menuSelect > 0 && menuSelect < (Item.getMenuSize() + 1)){
                newOrder.addItem(Item.getMenuItem(menuSelect - 1));
            }
            else{
                System.out.println("Invalid choice, please tryu again\n");
            }
        }
        
        return newOrder;
    }

}
