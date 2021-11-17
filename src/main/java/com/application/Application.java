package com.application;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Application {
    private CalcService calculator;
    private Operation operation;
    private ExpInput expInput;

    public void run(){
        int key;

        do {
            operation.setNum1(expInput.inputData());
            operation.setNum2(expInput.inputData());

            System.out.println("------------------------------------------------------------");
            System.out.println("Choose type of operation:");
            System.out.println("[1] - sum");
            System.out.println("[2] - sub");
            System.out.println("[3] - mul");
            System.out.println("[4] - div");
            System.out.println("[0] - exit");
            System.out.println("------------------------------------------------------------");

            key = expInput.expInputKey(0, 4);

            switch (key) {
                case 1 -> outputResult("sum");
                case 2 -> outputResult("sub");
                case 3 -> outputResult("mul");
                case 4 -> outputResult("div");
            }

        } while (key != 0);
    }

    private void outputResult(String op) {
        operation.setResult(calculator.doOperation(operation.getNum1(), operation.getNum2(), op));
        System.out.println("|** Result of operation is: " + operation.getResult() + " ***|\n");
    }
}
