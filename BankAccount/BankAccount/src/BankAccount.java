import java.util.Random;
public class BankAccount {
    private String accNumber;
    private Double checkingBalance;
    private Double savingsBalance;

    private static Double totalMoney = 0.0;
    private static Double totalAccounts = 0.0;

    public BankAccount(){
        accNumber = this.setAccNum();
        checkingBalance = 0.0;
        savingsBalance = 0.0;
        totalAccounts++;
    }

    public BankAccount(Double checkingInit){
        accNumber = this.setAccNum();
        checkingBalance = checkingInit;
        savingsBalance = 0.0;
        totalMoney += checkingInit;
        totalAccounts++;
    }
    public BankAccount(Double checkingInit,Double savingsInit){
        accNumber = this.setAccNum();
        checkingBalance = checkingInit;
        savingsBalance = savingsInit;
        totalMoney += checkingInit;
        totalMoney += savingsInit;
        totalAccounts++;
    }

//===========================================
//   toString Overload
//===========================================

    public String toString(){
        String checkingBal = String.format("$%.2f",this.getCheckingBalance());
        String savingsBal = String.format("$%.2f",this.getSavingsBalance());
        String accNum = this.getAccNum();;
        
        return("Info for: " + accNum + "\nChecking: " + checkingBal + "\nSavings: " + savingsBal);
    }

//===========================================
//   Generate Acc Num / Get Acc Num
//===========================================

    private String setAccNum(){
        String retString = "";
        Random rand = new Random();
        for (int i = 0; i < 10; i++){
            int num = rand.nextInt(10) + 48;
            retString += (char) num;
        }
        System.out.println(retString);
        return retString;
    }

    public String getAccNum(){
        return this.accNumber;
    }

//===========================================
//   Get and Set Checking
//===========================================

    public Double getCheckingBalance(){
        return this.checkingBalance;
    }

    public void setCheckingTotal(Double amt){
        if (this.isValidAmount("Checking", amt)){
            BankAccount.totalMoney -= this.getCheckingBalance();
            BankAccount.totalMoney += amt;
            this.checkingBalance = amt;
            System.out.println("New Balance: " + this.getCheckingBalance());
        }
        else{
            System.out.println("Invalid, new ammount is too low.");
        }
    }

    public void setCheckingBalance(char opp,Double amt) {
        if (opp == '+'){
            BankAccount.totalMoney += amt;
            System.out.println("Deposit Into Checking..\n");
            this.checkingBalance += amt;
        }
        else if (opp == '-'){
            if (this.isValidAmount("Checking", this.getCheckingBalance()-amt)){
                System.out.println("Withdraw from Checking..\n");
                this.checkingBalance -= amt;
                BankAccount.totalMoney -= amt;
            }
            else{
                System.out.println("Insufficent Funds");
            }
        }
        else if  (opp == '='){
            System.out.println("Setting Checking Balance..\n");
            this.setCheckingTotal(amt);
        }
        else{
            System.out.println("Invalid Opperator Given");
        }
        if (this.checkingBalance < 0.0){
            this.checkingBalance = 0.0;
        }
        System.out.println("New Balance: " + this.getCheckingBalance());
    }

//===========================================
//   Get and Set Savings
//===========================================

    public Double getSavingsBalance(){
        return this.savingsBalance;
    }

    public void setSavingsTotal(Double amt){
        if (this.isValidAmount("Savings", amt)){
            BankAccount.totalMoney -= this.savingsBalance;
            BankAccount.totalMoney += amt;
            this.savingsBalance = amt;
            System.out.println("New Balance: " + this.getSavingsBalance());
        }
        else{
            System.out.println("Invalid, new ammount is too low.");
        }
    }

    public void setSavingsBalance(char opp, Double amt) {
        if (opp == '+'){
            this.savingsBalance += amt;
            BankAccount.totalMoney += amt;
        }
        else if (opp == '-'){
            if (this.isValidAmount("Savings", this.getSavingsBalance()-amt)){
                this.savingsBalance -= amt;
                BankAccount.totalMoney -= amt;
            }
            else{
                System.out.println("Insufficent Funds");
            }
        }
        else if  (opp == '='){
            this.setSavingsTotal(amt);
        }
        else{
            System.out.println("Invalid Opperator Given");
        }
        if (this.savingsBalance < 0.0){
            this.savingsBalance = 0.0;
        }
        System.out.println("New Balance: " + this.getSavingsBalance());
    }

    private Boolean isValidAmount(String acc, Double amt){
        Boolean isValid = true;
        // Double testBalance = 0.0;
        // if (acc == "Checking"){
        //     testBalance = this.getCheckingBalanche();
        //     System.out.println("1");
        // }
        // else if (acc == "Savings"){
        //     testBalance = this.getSavingsBalance();
        //     System.out.println("2");
        //     System.out.println(this.savingsBalance);
        // }
        // else{
        //     isValid = false;
        //     System.out.println("3");
        // }

        if (amt < 0){
            isValid = false;
            System.out.println("11");
        }
        // if (amt > testBalance){
        //     isValid = false;
        //     System.out.println("22");
        // }

        return isValid;
    }

    //===========================================
    //   Get and Set Mutli
    //===========================================

    public void multiSetBalance(String acc, char opp, Double amt){
        if (acc == "Checking"){
            this.setCheckingBalance(opp,amt);
        }
        else if (acc == "Savings"){
            this.setSavingsBalance(opp,amt);
        }
        else{
            System.out.println("Invalid Account Chosen!\nMust be Checking or Savings.");
        }
    }

    //===========================================
    //   Get and Set Checking
    //===========================================

    public static Double getTotalMoney() {
        return BankAccount.totalMoney;
    }

    public static Double getTotalAccounts() {
        return BankAccount.totalAccounts;
    }

}
