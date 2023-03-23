import java.sql.*;
class sql3 {

	public static void main(String[] args)throws Exception {

		String url = "jdbc:mysql://localhost/ri_db";
		String uname ="test";
		String pass = "test123";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, uname, pass);
		
		Statement st = conn.createStatement();
		int count = st.executeUpdate("delete from student where mark1>=70 and mark1<=75");
		if(count > 0)
		{
			System.out.println("student record deleted");
		}
		else {
			System.out.println("Something went wrong");
		}
		st.close();
		conn.close();
	}
}
    