/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import classes.Transporte;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vladi
 */
public class Transportes {
    static ArrayList<Transporte> transportesDB = new ArrayList();
    static ConexionDB conexion = new ConexionDB();
    public Transportes(){
        actualizarTransportes();
    }
    public static void actualizarTransportes(){
        try {
            conexion.ejecutarConsulta("SELECT * FROM transportes");
            while(conexion.rs.next()){
                transportesDB.add(new Transporte(conexion.rs.getInt("idtransporte"),conexion.rs.getString("nombre"),conexion.rs.getString("telefono"),conexion.rs.getString("direccion")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Transportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static boolean crearTransporte(Transporte transporte){
        boolean consulta=false;
        return consulta;
    }
    public static Transporte verTransporte(String nombreTransporte){
        Transporte consulta = null;
        try {
            conexion.ejecutarConsulta("SELECT * FROM transportes WHERE nombre='"+nombreTransporte+"'");
            while(conexion.rs.next()){
                consulta = new Transporte(conexion.rs.getInt("idtransporte"),conexion.rs.getString("nombre"),conexion.rs.getString("telefono"),conexion.rs.getString("direccion"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Transportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
    }
    public static String getNombreTransporte(int idTransporte){
        String consulta = null;
        try {
            conexion.ejecutarConsulta("SELECT * FROM transportes WHERE idTransporte='"+idTransporte+"'");
            while(conexion.rs.next()){
                consulta = conexion.rs.getString("nombre");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Transportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
    }
    static boolean modificarTransporte(Transporte corrida){
        boolean consulta=false;
        return consulta;
    }
    static boolean eliminarTransporte(Transporte corrida){
        boolean consulta=false;
        return consulta;
    }
    static ArrayList<Transporte> verTransportes(){
        return transportesDB;
    }
    
}
