package calculator.operation;

public class Addition extends Operation {

    @Override
    public void calculate() {
        result = (double) firstOperand + (double) secondOperand;
    }
}
