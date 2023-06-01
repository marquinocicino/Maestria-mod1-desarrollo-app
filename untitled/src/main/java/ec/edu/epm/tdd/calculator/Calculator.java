package ec.edu.epm.tdd.calculator;

public class Calculator  {

    private int ans;

    public int addition (int a, int b){
        return a+b;
    }
    public int substraction (int a, int b){
        return a-b;
    }

    public int division (int a, int b){
        return a/b;
    }
    public int division_bck (int a, int b){
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
        try {
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return a*b;
    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }
}
