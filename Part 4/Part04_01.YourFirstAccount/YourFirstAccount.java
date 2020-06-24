
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account nicoAccount = new Account("Nico's account", 100.0);

        nicoAccount.deposit(20.0);
        System.out.println(nicoAccount);
    }
}
