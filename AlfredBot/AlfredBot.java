import java.util.Date;
public class AlfredBot {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return (String.format("Hello, %s lovely to see you.", name));
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date theDate = new Date();
        return "It is currently " + theDate;
    }
    
    public String respondBeforeAlexis(String conversation) {
        String finalAnswer = "";
        conversation = conversation.toLowerCase();
        if (conversation.indexOf("alexis") >= 0){
            finalAnswer = finalAnswer.concat("Alexa isn't quite capable of that. ");
        }
        if (conversation.indexOf("alfred") >= 0){
            finalAnswer = finalAnswer.concat("Alfred at your service. ");
        }
        if (finalAnswer == ""){
            finalAnswer = finalAnswer.concat("That's none of my business.");
        }

        return (finalAnswer);
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

