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
    public static ArrayList<String[]> clientesDB = new ArrayList();
    static ConexionDB conexion = new ConexionDB();
    
    public static void insertarCliente(Cliente cliente){
        HiloInsertarCliente insertar = new HiloInsertarCliente();
        insertar.setCliente(cliente);
        insertar.start();
    }
    public static Cliente verCliente(Cliente cliente){
        Cliente consulta = null;
        HiloVerCliente hvc = new HiloVerCliente();
        hvc.setCliente(cliente);
        hvc.start();
        consulta=hvc.getCliente();
        return consulta;
    }
    public static boolean modificarCliente(Cliente cliente){
        boolean consulta = false;
        HiloModificarCliente hmc = new HiloModificarCliente();
        hmc.setCliente(cliente);
        hmc.start();
        return consulta;
    }
    public static boolean eliminarCliente(int idCliente){
        boolean consulta = false;
        HiloEliminarCliente hec = new HiloEliminarCliente();
        hec.setIdCliente(idCliente);
        hec.start();
        return consulta;
    }
    public static void actualizarClientes(){
        clientesDB.clear();
        try {
            clientesDB.clear();
            String sql = "SELECT * FROM clientes";
            conexion.ejecutarConsulta(sql);
            while(conexion.rs.next()){
                String[] c = new String[]{
                    String.valueOf(conexion.rs.getInt("idCliente")),
                    conexion.rs.getString("primerNombre"),
                    conexion.rs.getString("segundoNombre"),
                    conexion.rs.getString("primerApellido"),
                    conexion.rs.getString("segundoApellido"),
                    String.valueOf(conexion.rs.getInt("edad")),
                    conexion.rs.getString("direccion"),
                    conexion.rs.getString("telefono"),
                    conexion.rs.getString("tipo")};
                clientesDB.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static class HiloInsertarCliente extends Thread{
        Cliente cliente;
        public void run(){
            try {
                System.out.println("Se va agregar "+cliente);
                String sql = "INSERT INTO clientes (primerNombre,segundoNombre,primerApellido,segundoApellido,edad,telefono,direccion,tipo) VALUES (?,?,?,?,?,?,?,?)";
                PreparedStatement pst = conexion.conectar().prepareStatement(sql);
                pst.setString(1,cliente.getNombre());
                pst.setString(2,cliente.getSegundoNombre());
                pst.setString(3,cliente.getApellido());
                pst.setString(4,cliente.getSegundoApellido());
                pst.setInt(5,cliente.getEdad());
                pst.setString(6,cliente.getTelefono());
                pst.setString(7,cliente.getDireccion());
                pst.setString(8,cliente.getTipo());
                pst.execute();
                JOptionPane.showMessageDialog(null,"Se ha registrado con exito");
            } catch (SQLException ex) {
                Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println(ex.getMessage());
                JOptionPane.showMessageDialog(null,"No se ha registrado con exito");
            }
        }
        public void setCliente(Cliente cliente){
            this.cliente = cliente;
        }
    }
    static class HiloEliminarCliente extends Thread{
        int idCliente;
        public void run(){
            try {
                String sql = "DELETE FROM clientes WHERE (idCliente='"+idCliente+"')";
                conexion.stm.execute(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        public void setIdCliente(int idCliente){
            this.idCliente = idCliente;
        }
    }
    static class HiloModificarCliente extends Thread{
        Cliente cliente;
        public void run(){
            try {
                String sql = "UPDATE clientes SET "
                        + "primerNombre='"+cliente.getNombre()+"',"
                        + "segundoNombre='"+cliente.getSegundoNombre()+"',"
                        + "primerApellido='"+cliente.getApellido()+"',"
                        + "segundoApellido='"+cliente.getSegundoApellido()+"',"
                        + "edad='"+cliente.getEdad()+"',"
                        + "telefono='"+cliente.getTelefono()+"',"
                        + "direccion='"+cliente.getDireccion()+"',"
                        + "tipo='"+cliente.getTipo()+"' WHERE idCliente='"+cliente.getIdCliente()+"'";
                conexion.stm.executeUpdate(sql);
                JOptionPane.showConfirmDialog(null, "Se acutalizó correctamente");
            } catch (SQLException ex) {
                Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        public void setCliente(Cliente cliente){
            this.cliente = cliente;
        }
    }
    static class HiloVerCliente extends Thread{
        Cliente cliente;
        public void run(){
            try {
                String sql = "SELECT 1 FROM clientes WHERE (idCliente=+"+cliente.getIdCliente()+")";
                conexion.ejecutarConsulta(sql);
                while(conexion.rs.next()){
                    cliente = new Cliente(conexion.rs.getInt("idCliente"),
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
                Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        public Cliente getCliente(){
            return cliente;
        }
        public void setCliente(Cliente cliente){
            this.cliente=cliente;
        }
    }
}
