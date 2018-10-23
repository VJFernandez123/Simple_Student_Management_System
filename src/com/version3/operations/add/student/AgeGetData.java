package com.version3.operations.add.student;

import java.util.logging.Logger;

public class AgeGetData extends GetData {

    public int getData() {
        Logger.getLogger("Input Age : ");
        return scanner.nextInt();
    }
}
