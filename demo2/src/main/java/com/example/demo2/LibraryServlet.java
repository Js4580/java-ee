package com.example.demo2;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class LibraryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5455/jn", "nazaramanturov", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from books");
            while (resultSet.next()) {
                printWriter.println(resultSet.getString("id"));
                printWriter.println(resultSet.getString("title"));
                printWriter.println(resultSet.getString("author"));
                printWriter.println(resultSet.getString("quantity"));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException("вот этот");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
