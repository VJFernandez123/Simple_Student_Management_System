package com.version3.input;

import com.version3.InvalidOperationException;

import java.util.Scanner;

public class GetOperationNumber {
    public int getInputNumber() throws InvalidOperationException {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if(choice < 1 || choice > 3){
            throw new InvalidOperationException("Input Operation Number is Invalid!");
        }
        return choice;
    }
}
