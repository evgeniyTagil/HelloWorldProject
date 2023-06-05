package lesson20_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySqlExample {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "root")) {
            connection.setAutoCommit(false); //код ниже не будет менять данные в DataBase пока не будет connection.commit();
            connection.prepareStatement("\n" +
                    "insert into DEVELOPERS(NAME, WORK_POSITION, AGE)" + "value ('Gleb','Developer','23'),('Anton','QA',30);").execute(); //execute() сделает в базе но там а не тут
            ResultSet rs = connection.prepareStatement("select * from DEVELOPERS").executeQuery(); //для работы с информацией из бд
            while (rs.next()){
                System.out.println(rs.getInt("ID") + " " + rs.getString("NAME") +
                        " " + rs.getInt("AGE"));
                connection.commit();
                //connection.rollback() убрать все что не подверглось connection.commit();

            }        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
