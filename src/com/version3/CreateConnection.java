package com.version3;

import com.sun.media.jfxmedia.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class CreateConnection {
    public Connection createConnection(){
        Connection connection=null;
        String url="jdbc:mysql://localhost:3306/mydata";
        String user="root";
        String password="";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            Logger.logMsg(0,e.getMessage());
        }

        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            Logger.logMsg(0,e.getMessage());
        }
        return(connection);
    }
}
