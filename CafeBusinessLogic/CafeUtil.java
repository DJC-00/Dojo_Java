import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {

    public Integer getStreakGoal(){
        Integer sum = new Integer(0);
        for(int i = 1; i < 11; i++){
            sum += i;
        }
        return sum;
    };

    public Integer getStreakGoal(Integer numWeeks){
        Integer sum = new Integer(0);
        for(int i = 1; i < numWeeks; i++){
            sum += i;
        }
        return sum;
    };
    
    public double getOrderTotal(double[] prices){
        Double orderSum = new Double(0);
        for(int i = 0; i < prices.length; i++){
            orderSum += prices[i];
        }
        return orderSum;
    };

    public void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i < menuItems.size(); i++){
            System.out.println(menuItems.get(i));
        }
    };

    public ArrayList<String> addCustomer(ArrayList<String> customers){
        Integer run = new Integer(1);
        while(run != 0){
            System.out.println("\nWelcome, Please enter your name: ");
            System.out.println("(Type 'quit' to stop)");
            String userName = System.console().readLine();
            if (userName.equals("quit")){
                run = 0;
                System.out.println("--- Stopping ---");
                return customers;
            };
            customers.add(userName);
            System.out.println("\nHello " + customers.get(customers.size()-1)+ " ,you are number " + customers.size() + " in line.");
        };
        return customers;

    };
}
