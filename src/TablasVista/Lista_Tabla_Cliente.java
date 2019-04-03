/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablasVista;

import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author JC
 */
public class Lista_Tabla_Cliente extends AbstractTableModel {

    String[] columnas = {"Codigo", "Nombre", "Sexo", "Estado"};
    public List<Cliente> cliente = new ArrayList<>();

    public Lista_Tabla_Cliente(List<Cliente> cliente) {
        this.cliente = cliente;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    @Override
    public int getRowCount() {
        return cliente.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object resp = null;
        if (columnIndex == 0) {
            resp = cliente.get(rowIndex).getCodigo_Cliente();
        } else {
            if (columnIndex == 1) {
                resp = cliente.get(rowIndex).getNombre_Cliente();
        } else {
            if (columnIndex == 2) {
                    resp = cliente.get(rowIndex).getSexo();
        }else{
                     resp = cliente.get(rowIndex).isEstado();
                }

            }
        }
        return resp;
    }

    public Cliente DameCliente(int fila) {
        return cliente.get(fila);
    }
}
