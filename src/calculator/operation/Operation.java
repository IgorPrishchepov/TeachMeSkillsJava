package calculator.operation;

public abstract class Operation {
    Object firstOperand;
    Object secondOperand;
    Object result;

    public abstract void calculate();


    public void setFirstOperand(Object firstOperand) {
        this.firstOperand = firstOperand;
    }

    public void setSecondOperand(Object secondOperand) {
        this.secondOperand = secondOperand;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
