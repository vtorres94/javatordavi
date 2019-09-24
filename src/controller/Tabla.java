/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Vladimir Torres 
 * @version 0.1
 */
public class Tabla extends DefaultTableModel{
    private int rowCount;
    private int columnCount;
    private boolean editable;
    private ArrayList<String[]> data;
    private String[] header;
    private DefaultTableModel model;
    
    public Tabla(ArrayList<String[]> data, String[] header){
        this.data=data;
        this.header=header;
        this.model = modeloTabla(data,header);
    }
    public static DefaultTableModel modeloTabla(ArrayList<String[]> datos, String[] header){
        String[][] data = new String[datos.size()][header.length];
        DefaultTableModel modelo = null;
        for(int i=0;i<datos.size();i++){
            for(int j=0;j<datos.get(i).length;j++){
                data[i][j]=datos.get(i)[j];
            }
        }
        modelo = new DefaultTableModel(data,header){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        return modelo;
    }
    @Override
    public int getRowCount() {
        return rowCount;
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data.get(rowIndex)[columnIndex];
    }
}
