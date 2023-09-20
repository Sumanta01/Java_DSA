
import java.sql.*;

public class Java_Jdbc {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
            Statement statement=con.createStatement();
            ResultSet rs=statement.executeQuery("select * from employees");

            while(rs.next()){
                System.out.print("FName"+rs.getString(1));
	            System.out.print("\tLName :"+rs.getString(4));
	            System.out.println("\tSalary :"+rs.getInt(8));

            }
            con.close();
            statement.close();
            rs.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
