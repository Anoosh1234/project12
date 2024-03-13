package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class data {

    public static void insert(String name, String email, String maths, String english) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/towncontext";
            try (Connection con = DriverManager.getConnection(url, "root", "anoosh");
                 PreparedStatement s = con.prepareStatement("insert into assignment(name, email, maths, english) values(?, ?, ?, ?)")) {
                s.setString(1, name);
                s.setString(2, email);
                s.setString(3, maths);
                s.setString(4, english);

                s.executeUpdate();
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
