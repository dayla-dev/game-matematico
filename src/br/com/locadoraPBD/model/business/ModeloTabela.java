/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadoraPBD.model.business;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dayla
 */
public class ModeloTabela extends AbstractTableModel{
    private ArrayList linha = null;
    private String[] coluna = null;

    public ModeloTabela(ArrayList linha, String[] coluna) {
        setLinha(linha);
        setColuna(coluna);
    }
    
    @Override
    public int getRowCount() {
        return linha.size();
    }

    @Override
    public int getColumnCount() {
        return coluna.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object[] linha = (Object[]) getLinha().get(rowIndex);
        return linha[columnIndex];
    }

    public ArrayList getLinha(){
        return linha;
    }
    
    public void setLinha(ArrayList linha) {
        this.linha = linha;
    }

    public String[] getColuna(){
        return coluna;
    }
    
    public String getColumnName(int numCol){
        return coluna[numCol];
    }
            
    public void setColuna(String[] coluna) {
        this.coluna = coluna;
    }
    
}
