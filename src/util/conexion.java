package util;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class conexion {
    private Connection conn = null;
    public Connection getConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/bd_tienda","root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return conn;
    }
}