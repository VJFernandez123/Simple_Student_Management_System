package com.version3.operations.get.allstudent;

public class AgeGetQuery {
    public String query(int age) {
        return ("SELECT * FROM data WHERE Age="+age+"");
    }
}
