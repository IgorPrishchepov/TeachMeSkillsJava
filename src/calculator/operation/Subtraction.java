package calculator.operation;

public class Subtraction extends Operation {

    @Override
    public void calculate() {
        result = (double) firstOperand - (double) secondOperand;
    }
}
