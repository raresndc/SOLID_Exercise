package ro.ase.acs.sql.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

public interface ReadDataInterface {
    void readData(Connection connection) throws SQLException;
}
