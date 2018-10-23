package com.version3.operations.find.student;

import com.version3.InvalidOperationException;
import com.version3.operations.add.student.AddressGetData;
import com.version3.operations.add.student.AgeGetData;
import com.version3.operations.add.student.IdGetData;
import com.version3.operations.add.student.NameGetData;
import com.version3.operations.get.allstudent.ExecuteQuery;
import com.version3.operations.get.allstudent.AddressGetQuery;
import com.version3.operations.get.allstudent.AgeGetQuery;
import com.version3.operations.get.allstudent.IdGetQuery;
import com.version3.operations.get.allstudent.NameGetQuery;

import java.sql.SQLException;

public class FindStudentFactory {
    public void operation(int choice) throws InvalidOperationException, SQLException {

        String query=null;

        if (choice == 1) {
            IdGetData idGetData = new IdGetData();
            int id = idGetData.getData();

            IdGetQuery idGetQuery=new IdGetQuery();
            query=idGetQuery.query(id);

        }
        else if (choice == 2) {
            NameGetData nameGetData = new NameGetData();
            String name = nameGetData.getData();

            NameGetQuery nameGetQuery=new NameGetQuery();
            query=nameGetQuery.query(name);

        }

        else if (choice == 3) {
            AgeGetData ageGetData = new AgeGetData();
            int age = ageGetData.getData();

            AgeGetQuery ageGetQuery=new AgeGetQuery();
            query=ageGetQuery.query(age);

        }
        else if (choice == 4) {
            AddressGetData addressGetData = new AddressGetData();
            String address = addressGetData.getData();

            AddressGetQuery addressGetQuery=new AddressGetQuery();
            query=addressGetQuery.query(address);
        }

        ExecuteQuery executeQuery=new ExecuteQuery();
        executeQuery.executeQuery(query);
    }
}
