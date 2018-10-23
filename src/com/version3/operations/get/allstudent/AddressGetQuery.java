package com.version3.operations.get.allstudent;

public class AddressGetQuery {
    public String query(String address) {
        return ("SELECT * FROM data WHERE ID='"+address+"'");
    }
}
