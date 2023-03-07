package projectfx;

import java.sql.*;

public class Database {
    static Connection con;

    public static void connect() {
        if (con == null) {
            try {
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bank_management", "root", "0603");
                // Statement stmt = con.createStatement();
                // ResultSet rs = stmt.executeQuery("select * from users ");
                // while (rs.next())
                // System.out.println(rs.getString(1) + rs.getInt(2));
                // con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static ResultSet get(String sqlString) throws SQLException {
        connect();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sqlString);
        return rs;
    }
}
