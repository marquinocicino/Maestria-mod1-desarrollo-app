package ec.edu.epm.tdd.calculator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator c=null;

    @Before
    public void setUp(){
        c= new Calculator();
        System.out.println("metodo setUp()");
    }

    @Test
    public void given_two_integer_when_addition_then_ok(){
        assertEquals(6 ,c.addition(4,2));
        System.out.println("metodo adtion 1");
    }

    @Test
    public void given_two_integer_when_subtraction_then_ok(){
        assertEquals(6 ,c.substraction(8,2));
        System.out.println("metodo substraction 2");
    }

    @Test
    public void given_two_integer_when_multiplication_then_timeout(){
        assertEquals(10 ,c.multplication(5,2));
        System.out.println("metodo multplication 3");
    }

    @Test
    public void given_two_integer_when_division_then_execption(){
        assertEquals(3 ,c.division(6,2));
        System.out.println("metodo division 4");
    }
}