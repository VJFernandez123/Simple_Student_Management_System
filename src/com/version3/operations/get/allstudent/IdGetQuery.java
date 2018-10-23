package com.version3.operations.get.allstudent;

public class IdGetQuery {

    public String query(int id) {
        return ("SELECT * FROM data WHERE ID="+id+"");
    }
}
