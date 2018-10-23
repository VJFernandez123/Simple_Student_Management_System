package com.version3.operations.find.student;

import com.version3.InvalidOperationException;
import java.util.Scanner;

public class GetChooseNumber {
    public int getInputNumber() throws InvalidOperationException {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if(choice < 1 || choice > 4){
            throw new InvalidOperationException("Input Operation Number is Invalid!");
        }
        return choice;
    }
}
