/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Time;

/**
 *
 * @author vladi
 */
public class Corrida {
    private int idCorrida;
    private int idTransporte;
    private String origen;
    private String destino;
    private String fechaSalida;
    private Time horaSalida;
    private Double costo;
    
    public Corrida(int idCorrida, int idTransporte,String origen,String destino,String fechaSalida, Time horaSalida, Double costo){
        this.idCorrida = idCorrida;
        this.idTransporte = idTransporte;
        this.origen=origen;
        this.destino=destino;
        this.fechaSalida=fechaSalida;
        this.horaSalida=horaSalida;
        this.costo=costo;
    }

    /**
     * @return the idCorrida
     */
    public int getIdCorrida() {
        return idCorrida;
    }

    /**
     * @param idCorrida the idCorrida to set
     */
    public void setIdCorrida(int idCorrida) {
        this.idCorrida = idCorrida;
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
     * @return the nombreCorrida
     */
    public Double getCosto() {
        return costo;
    }

    /**
     * @param nombreCorrida the nombreCorrida to set
     */
    public void setCosto(Double costo) {
        this.costo=costo;
    }

    /**
     * @return the fechaSalida
     */
    public String getFechaSalida() {
        return fechaSalida;
    }

    /**
     * @param fechaSalida the fechaSalida to set
     */
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * @return the horaSalida
     */
    public Time getHoraSalida() {
        return horaSalida;
    }

    /**
     * @param horaSalida the horaSalida to set
     */
    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Corrida{" + "idCorrida=" + idCorrida + ", idTransporte=" + idTransporte + ", origen=" + origen + ", destino=" + destino + ", fechaSalida=" + fechaSalida + ", horaSalida=" + horaSalida + ", costo=" + costo + '}';
    }
    
}
