package com.version3.operations.add.student;

import java.util.logging.Logger;

public class IdGetData extends GetData{

    public int getData() {
        Logger.getLogger("Input ID : ");
        return scanner.nextInt();

    }
}
