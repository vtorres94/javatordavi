/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import classes.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Vladimir Torres 
 * @version 0.1
 */
public class Clientes {
    private ArrayList<String[]> clientesDB = new ArrayList();
    private ConexionDB conexion = new ConexionDB();

    public Clientes() {
        actualizarClientes();
    }

    public Cliente getClienteByID(int idCliente) {
        Cliente c = null;
        try {
            conexion.ejecutarConsulta("SELECT * FROM usuarios WHERE idUsuario='" + idCliente + "'");
            while (conexion.rs.next()) {
                c = new Cliente(
                        conexion.rs.getInt("idUsuario"),
                        conexion.rs.getString("primerNombre"),
                        conexion.rs.getString("segundoNombre"),
                        conexion.rs.getString("primerApellido"),
                        conexion.rs.getString("segundoApellido"),
                        conexion.rs.getInt("edad"),
                        conexion.rs.getString("direccion"),
                        conexion.rs.getString("telefono"),
                        conexion.rs.getString("tipo"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    public boolean crearCliente(Cliente cliente) {
        boolean consulta = false;
        consulta = conexion.ejecutarInstruccion("INSERT INTO clientes "
                + "(primerNombre, segundoNombre, primerApellido, segundoApellido,edad,direccion, telefono, tipo)"
                + " VALUES ('" + cliente.getNombre() + "',"
                + "'" + cliente.getSegundoNombre() + "',"
                + "'" + cliente.getApellido() + "',"
                + "'" + cliente.getSegundoApellido() + "',"
                + "'" + cliente.getEdad() + "',"
                + "'" + cliente.getDireccion() + "',"
                + "'" + cliente.getTelefono() + "',"
                + "'" + cliente.getTipo() + "')");
        return consulta;
    }

    public boolean editarCliente(Cliente cliente) {
        boolean consulta = false;
        consulta = conexion.ejecutarInstruccion("UPDATE clientes SET "
                + "primerNombre = '" + cliente.getNombre() + "', "
                + "segundoNombre = '" + cliente.getSegundoNombre() + "', "
                + "primerApellido = '" + cliente.getApellido() + "',"
                + "segundoApellido = '" + cliente.getSegundoApellido() + "',"
                + "edad = '" + cliente.getEdad() + "', "
                + "direccion = '" + cliente.getDireccion() + "', "
                + "telefono = '" + cliente.getTelefono() + "', "
                + "tipo = '" + cliente.getTipo() + "' WHERE idUsuario='" + cliente.getIdCliente() + "'");

        return consulta;
    }

    public boolean eliminarCliente(int idCliente) {
        boolean consulta = false;
        consulta = conexion.ejecutarInstruccion("DELETE FROM clientes WHERE idCliente='" + idCliente + "'");
        return consulta;
    }

    public void actualizarClientes() {
        if (conexion.isConnected()) {
            clientesDB.clear();
            try {
                conexion.ejecutarConsulta("SELECT * FROM clientes ");
                while (conexion.rs.next()) {
                    String[] c = new String[]{
                        String.valueOf(conexion.rs.getInt("idCliente")),
                        conexion.rs.getString("primerNombre") + " "
                        + conexion.rs.getString("segundoNombre") + " "
                        + conexion.rs.getString("primerApellido") + " "
                        + conexion.rs.getString("segundoApellido"),
                        conexion.rs.getString("edad"),
                        conexion.rs.getString("direccion"),
                        conexion.rs.getString("telefono"),
                        conexion.rs.getString("tipo")};
                    clientesDB.add(c);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    

    public ArrayList<String[]> getUsuarios() {
        return clientesDB;
    }
}