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
public class Cliente {
    private int idCliente;
    private String nombre;
    private String segundoNombre;
    private String apellido;
    private String segundoApellido;
    private int edad;
    private String telefono;
    private String direccion;
    private String tipo;
    
    public Cliente(){
        
    }
    public Cliente(int idCliente,String nombre,String segundoNombre,String apellido,String segundoApellido,int edad,String telefono,String direccion,String tipo){
        this.idCliente=idCliente;
        this.nombre=nombre;
        this.segundoNombre=segundoNombre;
        this.apellido=apellido;
        this.segundoApellido=segundoApellido;
        this.edad=edad;
        this.telefono=telefono;
        this.direccion=direccion;
        this.tipo=tipo;
    }
    
    public Cliente(String nombre,String segundoNombre,String apellido,String segundoApellido,int edad,String telefono,String direccion,String tipo){
        this.nombre=nombre;
        this.segundoNombre=segundoNombre;
        this.apellido=apellido;
        this.segundoApellido=segundoApellido;
        this.edad=edad;
        this.telefono=telefono;
        this.direccion=direccion;
        this.tipo=tipo;
    }
    
    public Cliente(int idCliente, String nombre, String apellido, int edad, String telefono, String direccion, String tipo){
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.telefono=telefono;
        this.direccion=direccion;
        this.tipo=tipo;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the segundoNombre
     */
    public String getSegundoNombre() {
        return segundoNombre;
    }

    /**
     * @param segundoNombre the segundoNombre to set
     */
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the segundoApellido
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * @param segundoApellido the segundoApellido to set
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String toString(){
        return getIdCliente()+" - "+getNombre()+" "+getSegundoNombre()+" "+getApellido()+" "+getSegundoApellido()+" - "+getTelefono();
    }
}
