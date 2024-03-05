package org.example.repository;
import org.example.model.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class StudentRepository {
    private static final String url = "jdbc:postgresql://localhost:5432/hrd_dt";
    private static final String username = "postgres";
    private static final String password = "1234";
    public static List<Student> getAllStudents(){
        try(
                Connection connection = DriverManager.getConnection(url,username,password);
                Statement statement = connection.createStatement();
        ){
            ResultSet rs = statement.executeQuery("select * from student_tb");
            while (rs.next()){
                System.out.println("student id: "+rs.getInt(1));
                System.out.println("student name: "+rs.getString(2));
                System.out.println("student age: "+rs.getString(3));
                System.out.println("student address: "+rs.getString(4));
                System.out.println("student classroom: "+rs.getString(5));
                System.out.println("student dateTime: "+rs.getInt(6));
            }
        }catch (Exception e){
            System.out.println("success");
        }
        return null;
    }
}
