package ec.edu.epm.tdd.calculator;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(value= Parameterized.class)
public class CalculatorParametersTest {


    private int a, b, expected;
    @Parameterized.Parameters
    public static Iterable <Object[]> parameters(){
        List <Object[]> objects= new ArrayList<Object[]>();
        objects.add(new Object[]{2,4,6});
        objects.add(new Object[]{1,8,9});
        objects.add(new Object[]{2,5,7});
        objects.add(new Object[]{7,3,10});
        objects.add(new Object[]{22,4,26});
        objects.add(new Object[]{12,14,26});
        return objects;
    }

    public CalculatorParametersTest(int a, int b,int expected){
        this.a=a;
        this.b=b;
        this.expected=expected;
    }

    @Test
    public void given_two_integer_when_addition_then_ok(){
        Calculator c= new Calculator();
        System.out.println("Test 1 Addition");
        int actual=c.addition(a,b);
        assertEquals(expected ,actual);
    }

    @Test
    public void given_two_integer_when_subtraction_then_ok(){
        Calculator c= new Calculator();
        System.out.println("Test 2 Subtraction ");
        int actual=c.substraction(a,b);
        assertEquals(expected ,actual);
    }

    @Test(timeout = 150)
    public void given_two_integer_when_multiplication_then_timeout(){
        Calculator c= new Calculator();
        System.out.println("Test 3 Multiplication");
        int actual=c.multplication(a,b);
        assertEquals(expected ,actual);
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_integer_when_division_then_exception(){
        Calculator c= new Calculator();
        System.out.println("Test 4 Division");
        int actual=c.division(a,b);
        assertEquals(expected ,actual);
    }

}
