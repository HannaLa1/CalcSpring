package com.application.util;

import com.application.entity.Operation;
import com.application.service.CalcService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Application {
    private CalcService calculator;
    private Operation operation = new Operation();
    private ConsoleReader consoleReader;
    private ConsoleWriter consoleWriter;

    public Application(CalcService calculator, ConsoleReader consoleReader, ConsoleWriter consoleWriter) {
        this.calculator = calculator;
        this.consoleReader = consoleReader;
        this.consoleWriter = consoleWriter;
    }

    public void run(){
        int key;

        do {
            operation.setNum1(consoleReader.inputData());
            operation.setNum2(consoleReader.inputData());

            consoleReader.consoleInfo();

            key = consoleReader.expInputKey(0, 4);

            switch (key) {
                case 1 -> consoleWriter.outputResult(operation, calculator, "sum");
                case 2 -> consoleWriter.outputResult(operation, calculator,"sub");
                case 3 -> consoleWriter.outputResult(operation, calculator,"mul");
                case 4 -> consoleWriter.outputResult(operation, calculator,"div");
            }

        } while (key != 0);
    }
}
