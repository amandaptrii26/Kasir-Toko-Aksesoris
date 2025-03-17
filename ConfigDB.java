package projekpemdas2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 *
 * @author Amanda Putri
 */
public class ConfigDB {
    private static Connection MySQLConfig;

    public static Connection config() throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3307/projek_aksesoris";
            String user = "root";
            String password = "";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, password);
        }catch (SQLException e){
            System.out.println("Koneksi ke database gagal" + e.getMessage());
        }
        return MySQLConfig;
    }
}