/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import classes.Corrida;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vladimir Torres 
 * @version 0.1
 */

public class Corridas {
    static ConexionDB conexion = new ConexionDB();
    public static ArrayList<String[]> corridasDB = new ArrayList<>();
    private Transportes t;
    public Corridas(){
        actualizarCorridas();
    }
    public static boolean crearCorrida(Corrida corrida){
        boolean consulta=false;
        return consulta;
    }
    public static Corrida verCorrdia(String nombreCorrida){
        Corrida consulta = null;
        return consulta;
    }
    static boolean modificarCorrida(Corrida corrida){
        boolean consulta=false;
        return consulta;
    }
    static boolean eliminarCorrida(Corrida corrida){
        boolean consulta=false;
        return consulta;
    }
    static ArrayList<Corrida> verCorridas(){
        ArrayList<Corrida> corridas = null;
        return corridas;
    }
    public void actualizarCorridas(){
        try {
            conexion.ejecutarConsulta("SELECT * FROM corridas");
            while(conexion.rs.next()){
                String[] c = new String[]{
                    String.valueOf(conexion.rs.getInt("idCorrida")),
                    t.getTransporteByID(conexion.rs.getInt("idTransporte")),//Tal vez exista error ya que no hemos inicializado la variable t
                    conexion.rs.getString("fechaSalida"),
                    conexion.rs.getString("origen"),
                    conexion.rs.getString("destino"),
                    String.valueOf(conexion.rs.getTime("horaSalida")),
                    String.valueOf(conexion.rs.getDouble("costo"))};
                corridasDB.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Transportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
