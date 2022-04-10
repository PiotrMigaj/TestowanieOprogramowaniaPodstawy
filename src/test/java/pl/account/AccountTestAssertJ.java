package pl.account;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class AccountTestAssertJ {

//    private Account account;
//
//    @BeforeEach
//    void setupAccount(){
//        account = new Account();
//    }


    @Test
    void getName() {
        //given
        Account account = new Account();

        //when
        account.setName("Konto premium");

        //then
        assertThat(account.getName())
                .isNotNull()
                .isEqualTo("Konto premium");

        //assertThat(account.getName()).isEqualTo("Konto premium");
//        MatcherAssert.assertThat(account.getName(),equalTo("Konto premium"));

    }

    @Test
    void getBalance() {
        //given
        Account account = new Account();

        //when
        account.deposit(10);

        //then
        assertThat(account.getBalance())
                .isEqualTo(10);

    }
}