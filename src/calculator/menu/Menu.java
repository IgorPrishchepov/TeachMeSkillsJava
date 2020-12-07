package calculator.menu;

import calculator.exceptions.*;
import calculator.operation.*;

import java.util.Scanner;

public class Menu {

    private Scanner scanner;
    private Operation operation;
    private boolean useLastResult;
    private Object lastResult;
    public ArithmeticProcessor arithmeticProcessor;
    public MatrixProcessor matrixProcessor;

    {
        scanner = new Scanner(System.in);
        arithmeticProcessor = new ArithmeticProcessor();
        matrixProcessor = new MatrixProcessor();
    }

    public Operation getOperation() {
        return operation;
    }

    public void setLastResult() {
        this.lastResult = this.operation.getResult();
    }

    public void setUseLastResult(boolean useLastResult) {
        this.useLastResult = useLastResult;
    }

    public void menuStart() throws CalculatorException {
        String input = getInput();
        operation = operationFactory(input);
    }

    private Operation operationFactory(String input) {
        Operation operation = null;
        switch (input) {
            case ("+"):
                operation = new Addition();
                break;
            case ("-"):
                operation = new Subtraction();
                break;
            case ("*"):
                operation = new Multiplication();
                break;
            case ("/"):
                operation = new Division();
                break;
            case ("m"):
                operation = new MatrixMultiplication();
        }
        return operation;
    }


    private String getInput() throws CalculatorException {
        System.out.println(Constants.MENU_MESSAGE);
        String input = scanner.nextLine();
        if (input.equals("")){
            input = scanner.nextLine();
        }
        if (!validateInputs(input)) {
            throw new InvalidInputException("Invalid input!!");
        }
        quitProgram(input);
        backToMenu(input);
        clearLastResult(input);
        return input.toLowerCase();
    }

    private void backToMenu(String input) throws BackToMenuException {
        if (input.equalsIgnoreCase("b")) {
            throw new BackToMenuException();
        }
    }

    private void quitProgram(String input) throws QuitException {
        if (input.equalsIgnoreCase("q")) {
            throw new QuitException();
        }
    }

    private void clearLastResult(String input) throws ClearLastResultException {
        if (input.equalsIgnoreCase("c")) {
            useLastResult = false;
            throw new ClearLastResultException();
        }
    }

    private boolean validateInputs(String input) {
        for (String inp : Constants.VALID_INPUTS) {
            if (inp.equals(input)) {
                return true;
            }
        }
        return false;
    }

    public class ArithmeticProcessor {

        public void setOperands() throws CalculatorException {
            if (useLastResult) {
                operation.setFirstOperand(lastResult);
            } else {
                operation.setFirstOperand(getOperand("Input 1st operand"));
            }
            operation.setSecondOperand(getOperand("Input 2nd operand"));
            useLastResult = true;
        }


        private Double getOperand(String message) throws CalculatorException {
            double input;
            while (true) {
                System.out.println(message);
                if (scanner.hasNextDouble() || scanner.hasNextInt()) {
                    input = scanner.nextDouble();
                    break;
                } else {
                    String notDoubleInput = scanner.nextLine();
                    quitProgram(notDoubleInput);
                    backToMenu(notDoubleInput);
                }
            }
            return input;
        }
    }

    public class MatrixProcessor{

    }
}
