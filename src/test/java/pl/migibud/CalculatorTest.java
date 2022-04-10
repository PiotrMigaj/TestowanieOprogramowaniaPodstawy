package pl.migibud;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.migibud.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        //given
        int a = 4;
        int b = 6;
        //when
        int result = calculator.add(a,b);
        //then
        assertNotNull(calculator);
        assertEquals(10,result,"Wrong result");

    }
}