package ec.edu.epm.tdd.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public interface ICalculator {
    public int addition(int a, int b);
    public int substraction(int a, int b);
    public int multplication(int a, int b);
    public int division(int a, int b);
}
