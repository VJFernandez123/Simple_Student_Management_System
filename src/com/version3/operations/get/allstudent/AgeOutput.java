package com.version3.operations.get.allstudent;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AgeOutput implements Output {
    public void output(ResultSet rs) throws SQLException {

        System.out.print("\t\t|\t"+rs.getInt(3));

    }
}
