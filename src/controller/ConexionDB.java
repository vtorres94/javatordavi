package controller;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vladi
 */
public class ConexionDB {
    public static Connection cnx;
    public static String controlador = "com.mysql.jdbc.Driver";
    Statement stm;
    ResultSet rs;
    
    public Connection conectar(){
        try{
            Class.forName(controlador);
            cnx = DriverManager.getConnection("jdbc:mysql://localhost/tordaviinternational", "root", "");
            stm=cnx.createStatement();
            System.out.println("Conexion establecida");
        }catch (SQLException ex) {
            System.err.println("No se pudo conectar "+ex.getMessage());
        }catch (ClassNotFoundException ex) {
            System.err.println("No se encontro el conector "+ex.getMessage());
        }
        return cnx;
    }
    public boolean isConnected(){
        boolean conectado = false;
        if (cnx == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost/viajestordavi", "root", "");
                System.out.println("Conexion establecida");
                conectado = true;
            }catch (SQLException ex) {
                System.err.println("No se pudo conectar "+ex.getMessage());
                conectado = false;
            }catch (ClassNotFoundException ex) {
                System.err.println("No se encontro el conector "+ex.getMessage());
                conectado = false;
            }
        }else{
            try {
                if(cnx.isValid(0)){
                    conectado = true;
                }else{
                    cnx=null;
                    conectado = false;
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conectado;
    }
   public boolean ejecutarInstruccion(String sql){
       boolean result = false;
       try {
           stm = cnx.createStatement();
           stm.execute(sql);
           result = true;
       } catch (SQLException ex) {
           java.util.logging.Logger.getLogger(ConexionDB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }
       return result;
   }
   public ResultSet ejecutarConsulta(String sql){
       conectar();
       try {
           rs = stm.executeQuery(sql);
       } catch (SQLException ex) {
           Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
       }
       return rs;
   }
   
   
}