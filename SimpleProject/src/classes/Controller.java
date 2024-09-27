package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controller {

    Connection con = DB.getConnection();
    String sql;
    PreparedStatement ps;
    ResultSet rs;

    public void insert(Student s) {
        try {

            sql = "insert into students ( name , age , major ) values (?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setInt(2, s.getAge());
            ps.setString(3, s.getMajor());
            ps.execute();
            JOptionPane.showMessageDialog(null, "تم الحفظ");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public ArrayList<Student> display() {
        try {
            ArrayList<Student> arr = new ArrayList<>();
            sql = "select * from students";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String major = rs.getString("major");
                Student s = new Student(major, id, name, age);
                arr.add(s);
            }
            return arr;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public void edit(int id, Student s) {
        try {
            sql = "update students set name = ? , age = ? , major = ? where id = " + id;
            ps = con.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setInt(2, s.getAge());
            ps.setString(3, s.getMajor());
            ps.execute();
            JOptionPane.showMessageDialog(null, "تم التعديل");
        } catch (Exception e) {
        }
    }

    public void delete(int id) {
        try {
            sql = "delete from students where id = " + id;
            ps = con.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(null, "تم الحذف");
        } catch (Exception e) {
        }
    }

    public int getLastID() {
        try {
            sql = "select `AUTO_INCREMENT` FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'test' AND TABLE_NAME = 'students'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            rs.next();
            int id = rs.getInt(1);
            return id;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }

    public ArrayList<Student> search(int id) {
        try {
            ArrayList<Student> arr = new ArrayList<>();
            sql = "select * from students where id = " + id;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            rs.next();
            int i = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            String major = rs.getString("major");
            Student s = new Student(major, id, name, age);
            arr.add(s);
            return arr;
        } catch (Exception e) {
            return null;
        }
    }
}
