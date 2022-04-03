public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.50;
        double dripPrice = 2.00;
        double lattePrice = 4.00;
        double capPrice = 3.50;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        // Cindhuri
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        if (isReadyOrder1 == true){
            System.out.println(customer1 + readyMessage);
            System.out.println(displayTotalMessage + dripPrice);
        }
        else{
            System.out.println(customer1 + pendingMessage);
        }

        //Sam
        System.out.println(generalGreeting + customer2); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        if (isReadyOrder2 == true){
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + (lattePrice+lattePrice));
        }
        else{
            System.out.println(customer2 + pendingMessage);
        }
        //Jimmy
        System.out.println(generalGreeting + customer3); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        if (isReadyOrder3 == true){
            System.out.println(customer3 + readyMessage);
            System.out.println(displayTotalMessage + (lattePrice-dripPrice));
        }
        else{
            System.out.println(customer3 + pendingMessage);
        }
        //Noah
        System.out.println(generalGreeting + customer4); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        if (isReadyOrder4 == true){
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + capPrice);
        }
        else{
            System.out.println(customer4 + pendingMessage);
        }
    }
}
