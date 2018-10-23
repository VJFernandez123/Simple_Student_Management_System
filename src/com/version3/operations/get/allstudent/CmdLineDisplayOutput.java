package com.version3.operations.get.allstudent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

public class CmdLineDisplayOutput implements DisplayOutput {
    public void displayOutput(ResultSet resultSet) throws SQLException {

        DefaultOutput defaultOutput = new DefaultOutput();
        defaultOutput.printDefaultOutput();

        Output idOutput = new IdOutput();
        Output nameOutput = new NameOutput();
        Output ageOutput = new AgeOutput();
        Output addressOutput = new AddressOutput();

        while(resultSet.next()) {
            idOutput.output(resultSet);
            nameOutput.output(resultSet);
            ageOutput.output(resultSet);
            addressOutput.output(resultSet);
            Logger.getLogger("\n");
        }
    }
}
