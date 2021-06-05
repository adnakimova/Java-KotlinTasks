package com.mavenproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MavenProject {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:1306/mydatabase";
        String user = "aidana";
        String password = "Aselka79.";
        Connection connection = DriverManager.getConnection(url,user,password);
        Statement statement = connection.createStatement();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection is successful to the database" + url);
            String query = "INSERT INTO donutshop(name, price) VALUES('Donut1',145)";
            statement.execute(query);
            statement.execute("INSERT INTO donutshop(name, price) VALUES('Donut2',234)");
            statement.execute("INSERT INTO donutshop(name, price) VALUES('SweetFrost Donuts',146)");
            /*statement.execute("DELETE FROM donutshop WHERE name = 'Donut2'");*/

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally{
            statement.close();
            connection.close();
        }

    }
}
