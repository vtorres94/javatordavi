/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
/**
 *
 * @author Vladimir Torres 
 * @version 0.1
 */
public class Transporte {
    private int idTransporte;
    private String nombre;
    private String telefono;
    private String direccion;
    
    public Transporte(){
        
    }
    public Transporte(int idTransporte, String nombreTransporte,String telefono, String direccion){
        this.idTransporte = idTransporte;
        this.nombre = nombreTransporte;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * @return the idTransporte
     */
    public int getIdTransporte() {
        return idTransporte;
    }

    /**
     * @param idTransporte the idTransporte to set
     */
    public void setIdTransporte(int idTransporte) {
        this.idTransporte = idTransporte;
    }

    /**
     * @return the nombreTransporte
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombreTransporte the nombreTransporte to set
     */
    public void setNombre(String nombreTransporte) {
        this.nombre = nombreTransporte;
    }

    /**
     * @return the origen
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param origen the origen to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the destino
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param destino the destino to set
     */
    public void setDireccion(String direccion) {
        this.direccion =direccion;
    }
    
}
