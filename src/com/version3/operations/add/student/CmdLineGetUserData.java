package com.version3.operations.add.student;

public class CmdLineGetUserData implements GetUserData {

    public String getUserData() {

        IdGetData idGetData = new IdGetData();
        int newId = idGetData.getData();

        NameGetData nameGetData = new NameGetData();
        String name = nameGetData.getData();

        AgeGetData ageGetData = new AgeGetData();
        int age = ageGetData.getData();

        AddressGetData addressGetData = new AddressGetData();
        String address = addressGetData.getData();

        return ("INSERT INTO data VALUES(" + newId + ",'" + name + "'," + age + ",'" + address + "')");
    }

}
