package com.application.util;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Scanner;

@Data
@AllArgsConstructor
public class ConsoleReader {
    private Scanner scanner;

    public int expInputKey(int from, int to) {
        int value = 0;
        boolean flag;

        do {
            flag = true;
            if (!scanner.hasNextInt()) {
                flag = false;
                scanner.next();
                System.out.println("INPUT POSITIVE INTEGER NUMBER!");
            } else {
                value = scanner.nextInt();

                if (value < from || value > to) {
                    System.out.println("INPUT NUMBER AGAIN!");
                }
            }
        } while (!flag || value < from || value > to);

        return value;
    }

    public double expInput() {
        int value = 0;
        boolean flag;

        do {
            flag = true;
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();

            } else {
                flag = false;
                scanner.next();
                System.out.println("INPUT NUMBER AGAIN!");
            }
        } while (!flag);

        return value;
    }

    public double inputData() {
        System.out.println("------------------------------------------------------------");
        System.out.println("Input number >>> ");
        return expInput();
    }

    public void consoleInfo(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Choose type of operation:");
        System.out.println("[1] - sum");
        System.out.println("[2] - sub");
        System.out.println("[3] - mul");
        System.out.println("[4] - div");
        System.out.println("[0] - exit");
        System.out.println("------------------------------------------------------------");
    }
}
