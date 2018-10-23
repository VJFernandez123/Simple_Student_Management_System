package com.version3.operations.add.student;

import java.util.logging.Logger;

public class NameGetData extends GetData {
    public String getData() {
        Logger.getLogger("Input Name : ");
        return scanner.next();
    }
}
