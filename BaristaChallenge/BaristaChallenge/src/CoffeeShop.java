import java.util.ArrayList;
public class CoffeeShop {
    
    public static void main(String[] args) throws Exception {

         String[] customers = {"Bob", "Steve", "Jolene", "Veronica"};
        // Menu items
        Item blkCoffee = new Item("Black Coffee", 2.00f);
        Item latte = new Item("Latte", 3.00f);
        Item mocha = new Item("Mocha", 3.50f);
        Item capp = new Item("Cappichino", 5.00f);

        ArrayList<Item> tempOrder = new ArrayList<Item>();

        tempOrder.add(blkCoffee);
        Order order1 = new Order(customers[0],tempOrder);
        tempOrder = new ArrayList<Item>();

        tempOrder.add(blkCoffee);
        tempOrder.add(blkCoffee);
        tempOrder.add(mocha);
        Order order2 = new Order(customers[1],tempOrder);
        tempOrder = new ArrayList<Item>();

        tempOrder.add(latte);
        tempOrder.add(capp);
        Order order3 = new Order(customers[2],tempOrder);
        tempOrder = new ArrayList<Item>();

        tempOrder.add(blkCoffee);
        tempOrder.add(latte);
        tempOrder.add(capp);
        tempOrder.add(mocha);
        tempOrder.add(mocha);
        Order order4 = new Order(customers[3],tempOrder);
        tempOrder = new ArrayList<Item>();

        Order order5 = new Order();
        order5.addItem(blkCoffee);
        order5.addItem(mocha);
        order5.addItem(mocha);
    
        // Order variables -- order1, order2 etc.
    
        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Ready: %s\n", order2.ready);
        System.out.println("v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^\n");
        System.out.println(order1);
        System.out.println("\nv^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^\n");
        System.out.println(order2);
        System.out.println("\nv^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^\n");
        System.out.println(order3);
        System.out.println("\nv^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^\n");
        System.out.println(order4);
        System.out.println("\nv^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^");
        System.out.println(order5);
        System.out.println("\nv^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^");
        System.out.println("v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^\n");
        order1.waitOnOrder();
        System.out.println("\nv^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^\n");
        order2.waitOnOrder();
        System.out.println("\nv^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^\n");
        order3.waitOnOrder();
        System.out.println("\nv^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^\n");
        order4.waitOnOrder();
        System.out.println("\nv^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^");
        System.out.println("v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^\n");
        System.out.println(order1);
        System.out.println("\nv^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^\n");
        System.out.println(order2);
        System.out.println("\nv^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^\n");
        System.out.println(order3);
        System.out.println("\nv^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^\n");
        System.out.println(order4);
        System.out.println("\nv^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^\n");

        order1.addItem(blkCoffee);
        System.out.println(order1);
        System.out.println("\nv^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^v^\n");
        order1.delItem(blkCoffee);
        System.out.println(order1);
    
    }

}
