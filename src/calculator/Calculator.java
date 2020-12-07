package calculator;

import calculator.exceptions.*;
import calculator.menu.Menu;
import calculator.operation.MatrixMultiplication;

public class Calculator {
    private Menu menu;

    public Calculator() {
        this.menu = new Menu();
    }

    public void start(){
        while (true){
            try {
                menu.menuStart();
                if (menu.getOperation() instanceof MatrixMultiplication){
                   // menu.matrixProcessor
                }
                else {
                    menu.arithmeticProcessor.setOperands();
                }
                menu.getOperation().calculate();
                menu.setLastResult();
                System.out.println(menu.getOperation().getResult());
            } catch (QuitException e) {
                System.out.println("Bye-bye");
                break;
            }
            catch (InvalidInputException e){
                System.err.println(e.getMessage());
            }
            catch (BackToMenuException e){
                continue;
            }
            catch (ClearLastResultException e){
                continue;
            }
            catch (CalculatorException e) {
                e.printStackTrace();
            }
            catch (ArithmeticException ex){
                System.err.println(ex.getMessage());
                menu.setUseLastResult(false);
            }
        }


    }
}
