package com.application.util;

import com.application.entity.Operation;
import com.application.service.CalcService;

public class ConsoleWriter {
    public void outputResult(Operation operation, CalcService calc, String op) {
        operation.setResult(calc.doOperation(operation.getNum1(), operation.getNum2(), op));
        System.out.println("|** Result of operation is: " + operation.getResult() + " ***|\n");
    }
}
