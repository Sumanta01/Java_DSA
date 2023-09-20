import java.sql.*;

public class JDBC_MySQL {
    public static void main(String[] args){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","kiit");
            Statement statement= con.createStatement();
            ResultSet rs=statement.executeQuery("select * from student_det");
            while(rs.next()){
                int id=rs.getInt("id");
                String address=rs.getString("address");
                int age=rs.getInt("age");
                String college_name=rs.getString("college_name");
                String email=rs.getString("email");
                String name=rs.getString("name");
                System.out.println("ID: "+id+" Address: "+address+" Age:"+age+" College_Name: "+college_name+" Email:"+email+" Name: "+name);


            }
            con.close();
            statement.close();
            rs.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    
    
}
