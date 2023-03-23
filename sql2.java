import java.sql.*;
import java.util.*;
class sql2{
    
    public static void main(String ar[]){
        String id=null;
        
            Scanner sc=new Scanner(System.in);
            id=sc.nextLine();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            
            System.out.println("class not found"+e);
        }
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ri_db","test","test123");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select name,phone from students where sid="+id);
            while(rs.next()){
                
                System.out.print(rs.getString(1));
               System.out.println(rs.getString(2));                               
}
            st.close();
            con.close();
        }catch(SQLException e){
            
            System.out.println(e);
        }
        
    }
}