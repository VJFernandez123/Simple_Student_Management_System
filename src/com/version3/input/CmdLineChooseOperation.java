package com.version3.input;

import com.version3.InvalidOperationException;

public class CmdLineChooseOperation implements ChooseOperation {

    public int chooseOperation() throws InvalidOperationException {

        PrintMessage printMessage = new PrintMessage();
        printMessage.message();

        GetOperationNumber getOperationNumber = new GetOperationNumber();

        return getOperationNumber.getInputNumber();
    }
}
