package calculator.operation;

public class Division extends Operation {

    @Override
    public void calculate() {
        if ((double)secondOperand == 0){
            throw new ArithmeticException("Division by zero. Check your second operand!");
        }
        result = (double) firstOperand + (double) secondOperand;
    }
}
