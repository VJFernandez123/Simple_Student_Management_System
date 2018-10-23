package com.version3.operations.add.student;

import java.util.logging.Logger;

public class AddressGetData extends GetData {

    public String getData() {
        Logger.getLogger("Input Address :");
        return scanner.next();
    }
}
