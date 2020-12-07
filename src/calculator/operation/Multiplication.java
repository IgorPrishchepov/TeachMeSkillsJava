package calculator.operation;

public class Multiplication extends Operation {

    @Override
    public void calculate() {
        result = (double) firstOperand * (double) secondOperand;
    }
}
