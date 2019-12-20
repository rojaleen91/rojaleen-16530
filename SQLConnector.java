package assignments;

import  java.sql.Connection;
import  java.sql.Statement;
import  java.sql.ResultSet;
import  java.sql.DriverManager;
import  java.sql.SQLException;
public class  SQLConnector {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"

        String dbUrl = "jdbc:mysql://127.0.0.1:3306/nisum";

        //Database Username
        String username = "root";

        //Database Password
        String password = "10April@91";

        //Query to Execute
        String query = "select *  from employee;";

        //Load mysql jdbc driver
        Class.forName("com.mysql.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl, username, password);

        //Create Statement Object
        Statement stmt = con.createStatement();

        // Execute the SQL Query. Store results in ResultSet
        ResultSet rs = stmt.executeQuery(query);

        // While Loop to iterate through all data and print results
        while (rs.next()) {
            String myId = rs.getString(1);
            String myName = rs.getString(2);
            String myAge = rs.getString(3);
            String mySalary = rs.getString(4);
            System.out.println(myId + "  " + myName + " " + myAge + " " + mySalary);
        }
        // closing DB Connection
        con.close();
    }
}