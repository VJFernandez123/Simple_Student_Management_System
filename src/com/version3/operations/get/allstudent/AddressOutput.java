package com.version3.operations.get.allstudent;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddressOutput implements Output {
    @Override
    public void output(ResultSet rs) throws SQLException {
        System.out.print("\t|\t"+rs.getString(4));
    }
}
