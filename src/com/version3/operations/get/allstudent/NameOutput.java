package com.version3.operations.get.allstudent;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NameOutput implements Output {

    @Override
    public void output(ResultSet rs) throws SQLException {
        System.out.print("\t|\t\t"+rs.getString(2));
    }
}
