
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;


class MyConnection {

   
    
    
    public static Connection getConnection() {
        
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/kullanıcılar","root","");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/filmler","root","");
            } 
            catch (Exception ex) {
                System.out.print(ex.getMessage());
            }
        return con;
            
        
    }
        
        
            
        
        
    }
  

