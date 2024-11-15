/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USUARIO
 */
public class conexion {
    
    String Hostname = "127.0.0.1";
    String jdbcUrl = "jdbc:mysql://"+ Hostname+":3306/registro";
    String User = "root";
    String Password = "mari";

    Connection con;
    
    public conexion() {
        try {
            con = DriverManager.getConnection(jdbcUrl,User,Password);
        } catch (Exception e) {
            
            System.out.println("Error en la conecxion");
        }
                  
        }
    
    public Connection getconexion(){
        return con;
    }
    }
    
    

