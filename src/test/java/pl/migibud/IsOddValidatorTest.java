package pl.migibud;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.migibud.IsOddValidator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class IsOddValidatorTest {

    @DisplayName("Verification should pass for odd numbers")
    @Test
    void verificationShouldPassForOddNumber() {
        //given
        IsOddValidator isOddValidator = new IsOddValidator();
        final int oddNumber = 12;
        //when
        boolean isOdd=isOddValidator.isOdd(oddNumber);
        //assertThat(isOddValidator.isOdd(4),is(true));
        //then
//        Assertions.assertTrue(isOdd);

        assertTrue(isOdd);

        //MatcherAssert.assertThat();
    }

    @DisplayName("Verification should not pass for odd numbers")
    @Test
    void verificationShouldNotPassForOddNumber() {
        //given
        IsOddValidator isOddValidator = new IsOddValidator();
        final int oddNumber = 11;
        //when
        boolean isOdd=isOddValidator.isOdd(oddNumber);
        //assertThat(isOddValidator.isOdd(4),is(true));
        //then
//        Assertions.assertTrue(isOdd);

        assertFalse(isOdd);

        //MatcherAssert.assertThat();
    }


}