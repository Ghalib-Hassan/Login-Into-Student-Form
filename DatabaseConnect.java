import java.sql.*;

public class DatabaseConnect {
    public static Connection con = null;
        public static Connection connect(){
            try
            {
                con = DriverManager.getConnection("jdbc:ucanaccess://D:/Ghalib data/My Database/Student Information System.accdb");
            }
            catch(Exception e)
            {
                System.out.print(e);
            }
            if(con != null)
                return con;
            else
                return null;
        }
}
