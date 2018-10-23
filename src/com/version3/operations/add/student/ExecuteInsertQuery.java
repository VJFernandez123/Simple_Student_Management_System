package com.version3.operations.add.student;
import com.version3.CreateConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteInsertQuery {

    public void executeQuery(String query) throws SQLException {

        CreateConnection createConnection = new CreateConnection();

        Statement statement=null;
        try(Connection connection = createConnection.createConnection();) {
            statement = connection.createStatement();
            statement.execute(query);
        }finally {
            assert statement != null;
                statement.close();
        }





    }

}
