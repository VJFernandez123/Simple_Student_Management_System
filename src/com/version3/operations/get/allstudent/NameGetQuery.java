package com.version3.operations.get.allstudent;

public class NameGetQuery {
    public String query(String name) {
        return ("SELECT * FROM data WHERE Name='"+name+"'");
    }
}
