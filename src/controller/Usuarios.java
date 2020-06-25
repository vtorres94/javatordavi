/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import classes.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vladimir Torres
 * @version 0.1
 */
public class Usuarios {

    private ArrayList<String[]> usuariosDB = new ArrayList();
    private ConexionDB conexion = new ConexionDB();

    public Usuarios() {
        actualizarUsuarios();
    }

    public Usuario getUsuarioByID(int idUsuario) {
        Usuario u = null;
        try {
            conexion.ejecutarConsulta("SELECT * FROM usuarios WHERE idUsuario='" + idUsuario + "'");
            while (conexion.rs.next()) {
                u = new Usuario(
                        conexion.rs.getInt("idUsuario"),
                        conexion.rs.getString("primerNombre"),
                        conexion.rs.getString("segundoNombre"),
                        conexion.rs.getString("primerApellido"),
                        conexion.rs.getString("segundoApellido"),
                        conexion.rs.getString("puesto"),
                        conexion.rs.getDouble("salario"),
                        conexion.rs.getString("direccion"),
                        conexion.rs.getString("telefono"),
                        conexion.rs.getString("usuario"),
                        conexion.rs.getString("password"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }

    public boolean crearUsuario(Usuario usuario) {
        boolean consulta = false;
        consulta = conexion.ejecutarInstruccion("INSERT INTO usuarios "
                + "(primerNombre, segundoNombre, primerApellido, segundoApellido, puesto, salario, direccion, telefono, usuario, password)"
                + " VALUES ('" + usuario.getNombre() + "',"
                + "'" + usuario.getSegundoNombre() + "',"
                + "'" + usuario.getApellido() + "',"
                + "'" + usuario.getSegundoApellido() + "',"
                + "'" + usuario.getPuesto() + "',"
                + "'" + usuario.getSalario() + "',"
                + "'" + usuario.getDireccion() + "',"
                + "'" + usuario.getTelefono() + "',"
                + "'" + usuario.getUsuario() + "',"
                + "'" + usuario.getPassword() + "')");
        return consulta;
    }

    public boolean validarUsuario(String usuario) {
        boolean consulta = false;
        try {
            conexion.ejecutarConsulta("SELECT * FROM usuarios WHERE usuario='" + usuario + "'");
            while (conexion.rs.next()) {
                System.out.println("UsuarioDB: " + conexion.rs.getString("usuario") + " PassDB: " + conexion.rs.getString("password"));
                consulta = true;
            }
        } catch (SQLException ex) {
            consulta = true;
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
    }

    public boolean editarUsuario(Usuario usuario) {
        boolean consulta = false;
        consulta = conexion.ejecutarInstruccion("UPDATE usuarios SET "
                + "primerNombre = '" + usuario.getNombre() + "', "
                + "segundoNombre = '" + usuario.getSegundoNombre() + "', "
                + "primerApellido = '" + usuario.getApellido() + "',"
                + "segundoApellido = '" + usuario.getSegundoApellido() + "',"
                + "puesto = '" + usuario.getPuesto() + "', "
                + "salario = '" + usuario.getSalario() + "', "
                + "direccion = '" + usuario.getDireccion() + "', "
                + "telefono = '" + usuario.getTelefono() + "', "
                + "usuario = '" + usuario.getUsuario() + "', "
                + "password = '" + usuario.getPassword() + "' WHERE idUsuario='" + usuario.getIdUsuario() + "'");

        return consulta;
    }

    public boolean eliminarUsuario(int idUsuario) {
        boolean consulta = false;
        consulta = conexion.ejecutarInstruccion("DELETE FROM usuarios WHERE idUsuario='" + idUsuario + "'");
        return consulta;
    }

    public boolean login(String user, String password) {
        boolean consulta = false;
        try {
            conexion.ejecutarConsulta("SELECT * FROM usuarios WHERE usuario='" + user + "' && password='" + password + "'");
            while (conexion.rs.next()) {
                //System.out.println("UsuarioDB: " + conexion.rs.getString("usuario") + " PassDB: " + conexion.rs.getString("password"));
                consulta = true;
            }
        } catch (SQLException ex) {
            consulta = false;
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return consulta;
    }

    public void actualizarUsuarios() {
        if (conexion.isConnected()) {
            usuariosDB.clear();
            try {
                conexion.ejecutarConsulta("SELECT * FROM usuarios ");
                while (conexion.rs.next()) {
                    String[] u = new String[]{
                        String.valueOf(conexion.rs.getInt("idUsuario")),
                        conexion.rs.getString("primerNombre") + " "
                        + conexion.rs.getString("segundoNombre") + " "
                        + conexion.rs.getString("primerApellido") + " "
                        + conexion.rs.getString("segundoApellido"),
                        conexion.rs.getString("puesto"),
                        String.valueOf(conexion.rs.getDouble("salario")),
                        conexion.rs.getString("direccion"),
                        conexion.rs.getString("telefono"),
                        conexion.rs.getString("usuario"),
                        conexion.rs.getString("password")};
                    usuariosDB.add(u);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public ArrayList<String[]> llenarTabla(String busqueda) {
        ArrayList<String[]> data = new ArrayList<>();
        boolean seAgrega = false;
        for (int i = 0; i < usuariosDB.size(); i++) {
            for (int j = 0; j < usuariosDB.get(i).length; j++) {
                if (usuariosDB.get(i)[j].toString().toLowerCase().contains(busqueda.toLowerCase())) {
                    seAgrega = true;
                }
            }
            if (seAgrega) {
                data.add(usuariosDB.get(i));
                seAgrega = false;
            }
        }
        return data;
    }

    public ArrayList<String[]> getUsuarios() {
        return usuariosDB;
    }
}
