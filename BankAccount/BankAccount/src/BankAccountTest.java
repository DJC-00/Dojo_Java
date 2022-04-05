public class BankAccountTest {
    public static void main(String[] args) throws Exception {
        
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount(100.0);
        BankAccount account3 = new BankAccount(200.0);
        BankAccount account4 = new BankAccount(300.0,400.0);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println(account1);
        System.out.println(BankAccount.getTotalMoney());
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println(account2);
        System.out.println(BankAccount.getTotalMoney());
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        // System.out.println(account3);
        // System.out.println(BankAccount.getTotalMoney());
        // System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        // System.out.println(account4);
        // System.out.println(BankAccount.getTotalMoney());
        // System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        account1.multiSetBalance("Checking",'+',200.0);

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println(account1);
        System.out.println(BankAccount.getTotalMoney());
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");

        account1.multiSetBalance("Checking",'+',200.0);

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println(account1);
        System.out.println(BankAccount.getTotalMoney());
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");

        account1.multiSetBalance("Checking",'=',10000.0);

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println(account1);
        System.out.println(BankAccount.getTotalMoney());
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");

        account1.multiSetBalance("Checking",'-',200.0);

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println(account1);
        System.out.println(BankAccount.getTotalMoney());
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println(BankAccount.getTotalMoney());
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
        

    }
}
