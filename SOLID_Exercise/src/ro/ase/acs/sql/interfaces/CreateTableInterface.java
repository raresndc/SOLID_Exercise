package ro.ase.acs.sql.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface CreateTableInterface {
    void createTable(Connection connection) throws SQLException;
}
