package com.version3.operations.get.allstudent;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface Output {
    void output(ResultSet rs) throws SQLException;
}
