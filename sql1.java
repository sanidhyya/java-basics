import java.sql.*;
import java.util.Scanner;

 class StudentDetails {

	public static void main(String[] args)throws Exception {

		String url = "jdbc:mysql://localhost:3306/ri_db";
		String uname ="test";
		String pass = "test123";
		String query = "INSERT INTO student VALUES (?,?,?,?,?);";
		
		Scanner sc = new Scanner(System.in);
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, uname, pass);
		
		PreparedStatement st = conn.prepareStatement(query);
		
	//	System.out.println("Enter Number of  record going to insert4");
		
		int n =Integer.parseInt(sc.nextLine());
		
		for( int i=0;i<n;i++)
		{
	//		System.out.println("Enter the roll number");
			int rollno=Integer.parseInt(sc.nextLine());

	//		System.out.println("Enter the Student Name");
			String sname =sc.nextLine();

	//		System.out.println("Enter the Mark1");
			int mark1 = Integer.parseInt(sc.nextLine());

	//		System.out.println("Enter the Mark2");
			int mark2 = Integer.parseInt(sc.nextLine());

	//		System.out.println("Enter the Mark3");
			int mark3 = Integer.parseInt(sc.nextLine());
			
			st.setInt(1, rollno);
			st.setString(2, sname);
			st.setInt(3, mark1);
			st.setInt(4, mark2);
			st.setInt(5, mark3);
			st.executeUpdate();
			
		
		}
		ResultSet rs = st.executeQuery("select * from student");
		System.out.println("Student Details");
		while(rs.next())
		{	
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
		}
		st.close();
		conn.close();
	}
}
