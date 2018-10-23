package com.version3.operations;
import com.version3.InvalidOperationException;
import com.version3.operations.add.student.CmdLineGetUserData;
import com.version3.operations.add.student.ExecuteInsertQuery;
import com.version3.operations.get.allstudent.ExecuteQuery;
import com.version3.operations.get.allstudent.QueryForGetAllStudent;
import com.version3.operations.find.student.ChooseFindOperation;
import com.version3.operations.find.student.CmdLineChooseFindOperation;
import com.version3.operations.find.student.FindStudentFactory;

import java.sql.SQLException;

public class OperationFactory {

    public void operation(int choice) throws SQLException, InvalidOperationException {
        if(choice==1){
            CmdLineGetUserData getUserData=new CmdLineGetUserData();
            String query = getUserData.getUserData();

            ExecuteInsertQuery executeInsertQuery = new ExecuteInsertQuery();
            executeInsertQuery.executeQuery(query);
        }
        else if(choice==2) {
            QueryForGetAllStudent queryForGetAllStudent = new QueryForGetAllStudent();
            String query=queryForGetAllStudent.query();

            ExecuteQuery executeQuery = new ExecuteQuery();
            executeQuery.executeQuery(query);
        }

        else if(choice==3){
            ChooseFindOperation chooseFindOperation = new CmdLineChooseFindOperation();
            int findChoice= chooseFindOperation.getOperationNumber();

            FindStudentFactory findStudentFactory = new FindStudentFactory();
            findStudentFactory.operation(findChoice);

        }




    }
}
