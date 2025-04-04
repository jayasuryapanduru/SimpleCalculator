package interfaces;

public class funtionsInCalculator extends userDomain implements SimpleCalculator {

    @Override
    public int addition() {
        int a = getA();
        int b = getB();
        return a + b;
    }

    @Override
    public int subraction() {
        int a = getA();
        int b = getB();
        return a - b;
    }

    @Override
    public int multiplication() {
        int a = getA();
        int b = getB();
        return a * b;
    }

    @Override
    public double divison() {
        int a = getA();
        int b = getB();
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0; // Prevent divide by zero error
        }
        return (double) a / b; // Explicitly convert to double
    }
}
