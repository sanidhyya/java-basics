import java.utl.*;
import java.sql.*;

class sql33{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/ri_db";
		String uname ="test";
		String pass = "test123";

        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("class not found: "+e);
        }
        try{
            Connection conn = DriverManager.getConnection(url,uname,pass); 
            Statement st = conn.createStatement();
            int count = st.executeUpdate("delete from student where mark1>=70 and mark1<=75");
            if(count>0){
                System.out.println("record delted successfully");
            }else{
                System.out.println("something went wrong");
            }
            st.close();
            conn.close();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}