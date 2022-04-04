public class AlfredBot {
    public static void main(String[] args) {
        
        Methods methodApp = new Methods();
        String response = methodApp.getResponse(2);
        String responseTwo = methodApp.getResponse();
        System.out.println(response + " " + responseTwo);
    }
}
    

