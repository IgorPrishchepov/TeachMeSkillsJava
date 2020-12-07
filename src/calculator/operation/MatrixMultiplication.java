package calculator.operation;

public class MatrixMultiplication extends Operation {


    @Override
    public void calculate() {

    }

    private boolean isValid(){
        Matrix firstMatrix = (Matrix) firstOperand;
        Matrix secondMatrix = (Matrix) secondOperand;
        if (firstMatrix.getLines() != secondMatrix.getRows()){
            return false;
        }
        else return true;
    }
}
