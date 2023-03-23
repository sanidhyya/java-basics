import java.util.*;
import java.sql.*;

class sql44{
    public static void main(String [] args){
        final String url = "jdbc:mysql://localhost/ri_db";
        final String user = "test";
        final String pass = "test123";
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("class not found"+e);
        }
        try{
            Connection conn = DriverManager.getConnection(url,user,pass);
            Statement st = conn.createStatement();
            Scanner sc = new Scanner(System.in);
            int roll = sc.nextInt();
            String name = sc.nextLine();
            String att = sc.nextLine();
            st.executeUpdate("INSERT INTO sjtg01 VALUES("+roll+" , '"+name+"' ,'"+att+"')");
            ResultSet rs = st.executeQuery("SELECT * FROM sjtg01");
            while(rs.next()){
                System.out.println(rs.getInteger(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }

            System.out.println("consolidated count");
            rs = st.executeQuery("SELECT ATTENDANCE,COUNT(*) FROM sjtg01 GROUP BY ATTENDANCE");
            {
                System.out.println(rs.getString(1)+" "+rs.getInt(2));
            }
            st.close();
            rs.close();
        }catch(SQLException e){
            System.out.println(e);
        }

    } 
}