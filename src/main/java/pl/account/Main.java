package pl.account;

public class Main {
    public static void main(String[] args) {

        Account account = new Account();

        account.setName("Konto Premium");
        //System.out.println("Nazwa: "+account.getName());
        account.withdraw(1100);

        Account account1 = new Account();
        account1.setName("Moje konto");

        account.transfer(account1,1000);
        account1.getBalance();



    }
}
