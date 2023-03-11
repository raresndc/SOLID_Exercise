package ro.ase.acs.main;

import java.sql.Connection;
import java.sql.DriverManager;

import ro.ase.acs.sql.classes.CreateTable;
import ro.ase.acs.sql.classes.InsertData;
import ro.ase.acs.sql.classes.ReadData;
import ro.ase.acs.sql.interfaces.CreateTableInterface;
import ro.ase.acs.sql.interfaces.InsertDataInterface;
import ro.ase.acs.sql.interfaces.ReadDataInterface;

public class Main {

    private static final String CONNECTION = "jdbc:sqlite:database.db";
    private static final String INSTANCE_TYPE = "org.sqlite.JDBC";
    public static void main(String[] args) {

        try {
            Class.forName(INSTANCE_TYPE);
            Connection connection = DriverManager.getConnection(CONNECTION);
            connection.setAutoCommit(false);

            CreateTableInterface tableInterface = new CreateTable();
            tableInterface.createTable(connection);

            InsertDataInterface insertDataInterface = new InsertData();
            insertDataInterface.insertData(connection);

            ReadDataInterface readDataInterface = new ReadData();
            readDataInterface.readData(connection);

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}