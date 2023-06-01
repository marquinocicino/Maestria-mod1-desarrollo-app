package ec.edu.epm.tdd.calculator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator c=null;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass()");

    }

    @Before
    public void setUp(){
        System.out.println("setUp()");
        c= new Calculator();
    }

    @Test
    public void given_two_integer_when_addition_then_ok(){
        System.out.println("Test 1 Addition");
        assertEquals(6 ,c.addition(4,2));
    }

    @Test
    public void given_two_integer_when_subtraction_then_ok(){
        System.out.println("Test 2 Subtraction ");
        assertEquals(6 ,c.substraction(8,2));
    }

    @Test(timeout = 150)
    public void given_two_integer_when_multiplication_then_timeout(){
        System.out.println("Test 3 Multiplication");
        assertEquals(10 ,c.multplication(5,2));
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_integer_when_division_then_exception(){
        System.out.println("Test 4 Division");
        assertEquals(3 ,c.division(6,0));

    }
    @After
    public void tearDown(){
        System.out.println("TearDown Method");
        c.setAns(0);
        c=null;
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("TearDown Class");
    }
}