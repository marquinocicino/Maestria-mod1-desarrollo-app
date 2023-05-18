package ec.edu.epm.tdd.calculator;

public class Calculator  {
    public int addition (int a, int b){
        return a+b;
    }
    public int substraction (int a, int b){
        return a-b;
    }
    public int division (int a, int b){
        int resultado=0;
        try {
            resultado =a/b;
        } catch (ArithmeticException e) {
            resultado=0;
            System.out.println("dividendo 0");
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    public int multplication (int a, int b){
        return a*b;
    }
}
