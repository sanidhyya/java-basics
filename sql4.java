import java.util.Scanner;
import java.sql.*;
class sql4
{
    public static void main(String args[])
    {
        final String url = "jdbc:mysql://localhost/ri_db";
        final String user = "test";
        final String pass = "test123";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,user,pass);
            Statement st = con.createStatement();
            Scanner sc = new Scanner(System.in);
            int roll = sc.nextInt();
            String name = sc.next();
            String att = sc.next();
            st.executeUpdate("INSERT INTO sjtg01 VALUES ("+roll+",'"+name+"','"+att+"')");
            ResultSet rs = st.executeQuery("SELECT * FROM sjtg01");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            System.out.println("Consolidated attendance count:");
            rs = st.executeQuery("SELECT Attendance,COUNT(*) FROM sjtg01 GROUP BY Attendance");
            while(rs.next())
            {
                System.out.println(rs.getString(1)+" "+rs.getInt(2));
            }
            st.close();
            rs.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
