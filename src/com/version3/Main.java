package com.version3;

import com.sun.media.jfxmedia.logging.Logger;
import com.version3.input.ChooseOperation;
import com.version3.input.CmdLineChooseOperation;
import com.version3.operations.OperationFactory;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args){

        ChooseOperation chooseOperation = new CmdLineChooseOperation();
            int choice;
            try {
                choice = chooseOperation.chooseOperation();
            }catch (InvalidOperationException e){
                Logger.logMsg(0,e.getMessage());
                return;
            }
            OperationFactory operationFactory = new OperationFactory();

            try {
                operationFactory.operation(choice);
            } catch (SQLException | InvalidOperationException e) {
                Logger.logMsg(0,e.getMessage());
                e.printStackTrace();
            }
    }
}
