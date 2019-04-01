
package Modelo;

import java.util.Date;

public class Venta {
    
    private int Codigo_Venta;
    private int Cantidad;
    private Date Fecha;
    private double Subtotal;
    private double IGV;
    private double Total;
    Cliente cliente;

    public Venta() {
    }

    public Venta(int Codigo_Venta, int Cantidad, Date Fecha, double Subtotal, double IGV, double Total, Cliente cliente, Producto producto) {
        this.Codigo_Venta = Codigo_Venta;
        this.Cantidad = Cantidad;
        this.Fecha = Fecha;
        this.Subtotal = Subtotal;
        this.IGV = IGV;
        this.Total = Total;
        this.cliente = cliente;
        this.producto = producto;
    }

    public int getCodigo_Venta() {
        return Codigo_Venta;
    }

    public void setCodigo_Venta(int Codigo_Venta) {
        this.Codigo_Venta = Codigo_Venta;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public double getIGV() {
        return IGV;
    }

    public void setIGV(double IGV) {
        this.IGV = IGV;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    Producto producto;
    
   
    
    
}
