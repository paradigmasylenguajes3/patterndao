/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.unlar.patterndao.utils;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author hchanampe
 */
public class ConnectionDB {

   static final String JDBC_DRIVER = "org.postgresql.Driver";
   static final String DB_URL = "jdbc:postgresql://localhost:5432/library";
   

   
   private static Connection conn = null;



   public static Connection obtenerConexion() throws SQLException, ClassNotFoundException {
      // Read enviroment variables
      Dotenv dotenv;
      dotenv = Dotenv.configure().load();
      
      if (conn == null) {
         try {
            //Set Values from  .env configuration file
            String POSTGRES_USER = dotenv.get("POSTGRES_USER");
            String POSTGRES_PASSWORD = dotenv.get("POSTGRES_PASSWORD");
            
            // Set Driver to Database
            Class.forName(JDBC_DRIVER);
             //STEP 3: Open a connection
            conn = DriverManager.getConnection(DB_URL, POSTGRES_USER, POSTGRES_PASSWORD);
         } catch (SQLException ex) {
            System.out.println("fallo intentando ingresar credenciales");
         } catch (ClassNotFoundException ex) {
            throw new ClassCastException(ex.getMessage());
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
      return conn;
   }
   
   public static void cerrar() throws SQLException {
      if (conn != null) {
         conn.close();
      }
   }


   
 }
   
  
