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
            cstm = con.prepareCall("{Call AgregarCliente(?,?)}");
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

    public boolean UpdatePersona(Persona per) {
        Connection con = null;
        CallableStatement cstm = null;
        boolean resp = true;
        try {
            con = conexion.getConecion();
            con.setAutoCommit(false);
            cstm = con.prepareCall("{Call UpdatePersona(?,?,?,?)}");
            cstm.setString(1, per.getNombre());
            cstm.setString(2, per.getApellidoP());
            cstm.setString(3, per.getApellidoM());
            cstm.setInt(4, per.getIdpers());
            resp = cstm.execute();
            con.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            conexion.Cerrar1(con, cstm);
        }
        return resp;
    }

    public boolean DeletePersona(Persona per) {
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

    public List<Persona> listado() {
        Connection con = null;
        CallableStatement cstm = null;
        ResultSet rs = null;
        List<Persona> lista = null;
        try {
            lista = new ArrayList<>();
            con = conexion.getConecion();
            cstm = con.prepareCall("{Call Listar}");
            rs = cstm.executeQuery();
            Persona per = null;
            while (rs.next()) {
                per = new Persona();
                per.setIdpers(rs.getInt("idpersona"));
                per.setNombre(rs.getString("nombre"));
                per.setApellidoP(rs.getString("apellidoP"));
                per.setApellidoM(rs.getString("apellidoM"));
                lista.add(per);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            conexion.Cerrar2(cstm, rs);
        }
        return lista;
    }

}
}
