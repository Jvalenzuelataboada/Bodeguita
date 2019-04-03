package Controlador;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Modelo.Cliente;


public class Cliente_Procedimiento {
    
    Conexion conexion = new Conexion();
    
    public boolean AgregarPersona(Cliente cli) {
        Connection con = null;
        CallableStatement cstm = null;
        boolean resp = true;
        try {
            con = conexion.getConecion();
            con.setAutoCommit(false);
            cstm = con.prepareCall("{Call guardar_cliente(?,?)}");
            cstm.setString(1, cli.getNombre_Cliente());
            cstm.setString(2, cli.getSexo());
            resp = cstm.execute();
            con.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            conexion.Cerrar1(con, cstm);
        }
        return resp;
    }

    public boolean UpdateCliente(Cliente Cli) {
        Connection con = null;
        CallableStatement cstm = null;
        boolean resp = true;
        try {
            con = conexion.getConecion();
            con.setAutoCommit(false);
            cstm = con.prepareCall("{Call actualizar_cliente(?,?,?)}");
            cstm.setString(1, Cli.getNombre_Cliente());
            cstm.setString(2, Cli.getSexo());
            cstm.setBoolean(3, Cli.isEstado());
            // cstm.setInt(4, per.getIdpers());
            resp = cstm.execute();
            con.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            conexion.Cerrar1(con, cstm);
        }
        return resp;
    }

  /* public boolean DeletePersona(Persona per) {
        Connection con = null;
        CallableStatement cstm = null;
        boolean resp = true;
        try {
            con = conexion.getConecion();
            con.setAutoCommit(false);
            cstm = con.prepareCall("{Call DeletePersona(?)}");
            cstm.setInt(1, per.getIdpers());
            resp = cstm.execute();
            con.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            conexion.Cerrar1(con, cstm);
        }
        return resp;
    }
*/
    public List<Cliente> listado() {
        Connection con = null;
        CallableStatement cstm = null;
        ResultSet rs = null;
        List<Cliente> lista = null;
        try {
            lista = new ArrayList<>();
            con = conexion.getConecion();
            cstm = con.prepareCall("{Call mostrar_cliente}");
            rs = cstm.executeQuery();
            Cliente cli = null;
            while (rs.next()) {
                cli = new Cliente();
                cli.setCodigo_Cliente(rs.getInt("Codigo_Cliente"));
                cli.setNombre_Cliente(rs.getString("Nombre_Cliente"));
                cli.setSexo(rs.getString("Sexo"));
                cli.setEstado(rs.getBoolean("Estado"));
                lista.add(cli);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            conexion.Cerrar2(cstm, rs);
        }
        return lista;
    }
}
