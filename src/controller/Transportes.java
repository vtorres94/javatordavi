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
 * @author Vladimir Torres
 * @version 0.1
 */
public class Transportes {

    private ArrayList<String[]> transportesDB = new ArrayList();
    private ConexionDB conexion = new ConexionDB();

    public Transportes() {
        actualizarTransportes();
    }

    public void actualizarTransportes() {
        if (ConexionDB.isConnected()) {
            transportesDB.clear();
            try {
                conexion.ejecutarConsulta("SELECT * FROM transportes");
                while (conexion.rs.next()) {
                    String[] t = new String[]{
                        String.valueOf(conexion.rs.getInt("idtransporte")),
                        conexion.rs.getString("nombre"),
                        conexion.rs.getString("telefono"),
                        conexion.rs.getString("direccion")};
                    transportesDB.add(t);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Transportes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean crearTransporte(Transporte transporte) {
        boolean instruccion = false;
        instruccion = conexion.ejecutarInstruccion("INSERT INTO transportes "
                + "(nombre, telefono, direccion)"
                + " VALUES ('" + transporte.getNombre() + "',"
                + "'" + transporte.getTelefono() + "',"
                + "'" + transporte.getDireccion() + "')");
        return instruccion;
    }

    public Transporte getTransporteByNombre(String nombreTransporte) {
        Transporte consulta = null;
        if (ConexionDB.isConnected()) {    
            try {
                conexion.ejecutarConsulta("SELECT * FROM transportes WHERE nombre='" + nombreTransporte + "'");
                while (conexion.rs.next()) {
                    consulta = new Transporte(conexion.rs.getInt("idtransporte"), conexion.rs.getString("nombre"), conexion.rs.getString("telefono"), conexion.rs.getString("direccion"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Transportes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return consulta;
    }

    public Transporte getTransporteByID(int idTransporte) {
        Transporte consulta = null;
        try {
            conexion.ejecutarConsulta("SELECT * FROM transportes WHERE idTransporte='" + idTransporte + "'");
            while (conexion.rs.next()) {
                consulta = new Transporte(idTransporte, conexion.rs.getString("nombre"), conexion.rs.getString("telefono"), conexion.rs.getString("direccion"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Transportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
    }

    public String getNombreByID(int idTransporte) {
        String consulta = null;
        try {
            conexion.ejecutarConsulta("SELECT * FROM transportes WHERE idTransporte='" + idTransporte + "'");
            while (conexion.rs.next()) {
                consulta = conexion.rs.getString("nombre");
                System.out.println(consulta);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Transportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
    }

    public boolean modificarTransporte(Transporte transporte) {
        boolean consulta = false;
        consulta = conexion.ejecutarInstruccion("UPDATE transportes SET "
                + "nombre='" + transporte.getNombre() + "',"
                + "telefono='" + transporte.getTelefono() + "',"
                + "direccion='" + transporte.getDireccion() + "' WHERE idTransporte='" + transporte.getIdTransporte() + "'");
        return consulta;
    }

    public boolean eliminarTransporte(int idTransporte) {
        boolean consulta = false;
        consulta = conexion.ejecutarInstruccion("DELETE FROM transportes WHERE idTransporte='" + idTransporte + "'");
        return consulta;
    }

    public ArrayList<String[]> getTransportes() {
        return transportesDB;
    }

}
