package pl.account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void shouldReturnZeroBalanceForNewAccount(){
        //given
        Account account = new Account();
        //then
        assertEquals(0,account.getBalance());
    }

    @Test
    void shouldReturnBalanceOf100AfterDepositOf100(){

        //given
            Account account = new Account();
        //when
            account.deposit(100);
        //then
            assertEquals(100,account.getBalance());
    }

    @Test
    void shouldReturnValidAmountAfterWithdraw(){
        //given
            Account account = new Account();
        //when
            account.deposit(100);
            account.withdraw(50);
        //then
            assertEquals(50,account.getBalance());
    }

    @Test
    void shouldNotCompleteTransactionExceedingMaxDebitOf1000(){

    }



}