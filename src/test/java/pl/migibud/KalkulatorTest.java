package pl.migibud;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    private Kalkulator kalkulator;

    @BeforeEach
    void setup(){
        kalkulator = new Kalkulator();
    }


    @Test
    void dodaj() {
        //given
        int a=5;
        int b=6;

        //when
        int result = kalkulator.dodaj(a,b);

        //then
        assertEquals(11,result);


    }
}