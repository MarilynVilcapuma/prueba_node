/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USUARIO
 */
public class Conexion_mysql {

    public static void main(String[] args) {
       
    String Hostname = "127.0.0.1";
    String jdbcUrl = "jdbc:mysql://"+ Hostname+":3306/registro";
    String User = "root";
    String Password = "mari";
        
   Connection con = null;
   
        try {
            con = DriverManager.getConnection(jdbcUrl,User,Password);
            if(con != null){
                System.out.println("La conexion es exitosa");
            }
        } catch (Exception e) {
            System.out.println("Error en la conexion en la base de datos");
        }
   
        
    }
}
