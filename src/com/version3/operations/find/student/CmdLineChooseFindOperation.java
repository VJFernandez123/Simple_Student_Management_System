package com.version3.operations.find.student;

import com.version3.InvalidOperationException;


public class CmdLineChooseFindOperation implements ChooseFindOperation {
    public int getOperationNumber() throws InvalidOperationException {

        PrintChoiceMessage printChoiceMessage = new PrintChoiceMessage();
        printChoiceMessage.message();

        GetChooseNumber getChooseNumber = new GetChooseNumber();
        return (getChooseNumber.getInputNumber());
    }
}

