package pl.account;

import javax.lang.model.util.ElementScanner6;

public class Account {

    private static final String BORDER = "\t|\t";
    private static final int MIN_DEBIT = -1000;
    private String name;
    private int balance;
    private boolean debit;

    public Account() {
    }

//    public Account(){
//        this.balance=0;
//        this.debit=false;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isDebit() {
        return debit;
    }

    public void deposit(int amount) {

        int balanceBeforeOpp = this.balance;
        if (amount > 0) {
            this.balance += amount;
            this.validateDebit();
            this.print("Wplata", balanceBeforeOpp, this.balance, amount);
        } else {
            System.out.println("Kwota wplaty musi byc dodatnia!");
        }
    }

    public void withdraw(int amount) {

        int balanceBeforeOpp = this.balance;
        if (amount > 0) {
            if (!this.ifMaxDebitExceed(this.balance,amount)){
                this.balance -= amount;
                this.validateDebit();
                this.print("Wyplata", balanceBeforeOpp, this.balance, amount);
                //return true;
            }else {
                System.out.println("Nie można wykonać operacji przekraczającej debet.");
                //return false;
            }
        } else {
            System.out.println("Kwota wyplaty musi byc dodatnia!");
            //return false;
        }
    }

    private void print(String operationName, int balanceBeforeOpp, int balanceAfterOpp, int amount) {
        StringBuilder sb = new StringBuilder();
        sb.append("Stan konta: " + balanceBeforeOpp);
        sb.append(BORDER);
        sb.append(operationName + ": " + amount);
        sb.append(BORDER);
        sb.append("Po operacji: " + balanceAfterOpp);
        System.out.println(sb);
    }

    public boolean ifMaxDebitExceed(int balance, int amount){
        return balance-amount<= MIN_DEBIT;
    }

    private void validateDebit(){

        if (this.balance<0){
            this.debit=true;
            System.out.println("Ujemny stan konta");
        }else {
            this.debit=false;
        }
    }

    public void transfer(Account other,int amount){

        int tmpBalance = this.balance;
        this.withdraw(amount);

        if (tmpBalance!=this.balance){
            other.deposit(amount);
        }else {
            System.out.println("Nie mozna wykonac operacji przekraczajacej debet.");
        }
    }
}
