package com.version3.operations.get.allstudent;

import com.version3.CreateConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQuery {
    public void executeQuery(String query) throws SQLException {

        CreateConnection createConnection = new CreateConnection();

        Statement statement=null;
        try(Connection connection = createConnection.createConnection();) {
            statement = connection.createStatement();
            DisplayOutput displayOutput = new CmdLineDisplayOutput();
            displayOutput.displayOutput(statement.executeQuery(query));
        }finally {
            assert statement != null;
                statement.close();
        }





    }
}
