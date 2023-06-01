package ec.edu.epm.tdd.calculator;

import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;

public class ICalculatorTest {

    @Test
    public void give_two_integers_when_addition_then_ok() {
        ICalculator c=Mockito.mock(ICalculator.class);
        Mockito.when(c.addition(2,3)).thenReturn(5);
        assertEquals(5,c.addition(2,3));
    }


    @Test
    public void given_two_integer_when_subtraction_then_ok(){
        ICalculator c=Mockito.mock(ICalculator.class);
        Mockito.when(c.substraction(4,3)).thenReturn(1);
        assertEquals(1,c.substraction(4,3));
    }

    @Test
    public void given_two_integer_when_multiplication_then_timeout(){

        ICalculator c=Mockito.mock(ICalculator.class);
        Mockito.when(c.multplication(4,3)).thenReturn(12);
        assertEquals(12,c.multplication(4,3));

    }
    @Test
    public void given_two_integer_when_division_then_exception(){
        ICalculator c=Mockito.mock(ICalculator.class);
        Mockito.when(c.division(6,3)).thenReturn(2);
        assertEquals(2,c.division(6,3));

    }

}