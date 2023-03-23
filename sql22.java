import java.util.*;
import java.sql.*;

class sql22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextInt();
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotoundException e){
            System.out.println("class does not exist"+e);
        }
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ri_db","test","test123");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT name,phone FROM student WHERE id="+id);

            while(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println(rs.setInt(2));
            }
            st.close();
            conn.close();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}