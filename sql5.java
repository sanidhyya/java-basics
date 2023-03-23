import java.sql.*;
class sql5{
    
    public static void main(String ar[]){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            
            System.out.println("class not found"+e);
        }
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ri_db","test","test123");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from students");
            while(rs.next()){
                
                System.out.print(rs.getString(1));
                System.out.print(rs.getString(2));
                System.out.print(rs.getString(3));
                System.out.println("");
            }
            st.close();
            con.close();
        }catch(SQLException e){
            
            System.out.println(e);
        }
        
    }
}
