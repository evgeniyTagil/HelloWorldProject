package lesson20_db.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataBaseConnector {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root")){
            connection.setAutoCommit(false);

            ResultSet resultSet = connection.prepareStatement("select * from STUDENT").executeQuery();
            ResultSet set = connection.prepareStatement("select * from LOCATION").executeQuery();
            List<Student> studentList = new ArrayList<>();

            while (resultSet.next() && set.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("ID"));
                student.setName(resultSet.getString("NAME"));
                student.setAge(resultSet.getInt("AGE"));
                student.setLocation(set.getString("CITY"));
                studentList.add(student);
            }
            System.out.println(studentList);
            connection.commit();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
