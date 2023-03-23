import java.util.*;
import java.sql.*;

class sql11{
    public static void main(Strin[] args){
        String url = "jdbc:mysql://localhost/ri_db";
        String uname = "test";
        String pass = "test123";
        String query = "INSERT INTO student VALUE(?,?,?,?,?);";
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,uname,pass);
        PreparedStatement st = conn.prepareStatement("query");

        int n = sc.nextInt();
        for(int i=0;i<0;i++){
            int rollno = sc.nextInt();
            String sname = sc.nextLine();
            int mark1 = sc.nextInt();
            int mark2 = sc.nextInt();
            int mark3 = sc.nextInt();

            st.setInt(1, rollno);
            st.setString(2, sname);
            st.setInt(3, mark1);
            st.setInt(4, mark2);
            st.setInt(5, mark3);
            st.executeUpdate();
        }
        ResultSet rs = st.executeQuery("SELECT * from student");
        System.out.println("Student Details");
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
        }
        st.close();
        conn.close();
    }
}