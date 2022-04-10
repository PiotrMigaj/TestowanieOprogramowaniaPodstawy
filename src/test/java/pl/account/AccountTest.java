package pl.account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void shouldReturnZeroBalanceForNewAccount(){
        //given
        Account account = new Account();
        final int expectedBalance = 0;
        //when
        int balance = account.getBalance();
        //then
        assertEquals(expectedBalance,balance);
        assertEquals(0,account.getBalance());
    }

    @Test
    void shouldReturnBalanceOf100AfterDepositOf100(){

    }

    @Test
    void shouldReturnValidAmountAfterWithdraw(){

    }

    @Test
    void shouldNotCompleteTransactionExceedingMaxDebitOf1000(){

    }



}