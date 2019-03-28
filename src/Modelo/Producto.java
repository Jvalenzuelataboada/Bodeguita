
package Modelo;

import java.util.Date;


public class Producto {
   
    private int Codigo_Producto;

  
    private String Nombre_Producto;
    private int Stock;
    private Date Fecha_Vencimiento;
    private String Imagen;

    public Producto() {
    }
      
     public Producto(int Codigo_Producto, String Nombre_Producto, int Stock, Date Fecha_Vencimiento, String Imagen) {
        this.Codigo_Producto = Codigo_Producto;
        this.Nombre_Producto = Nombre_Producto;
        this.Stock = Stock;
        this.Fecha_Vencimiento = Fecha_Vencimiento;
        this.Imagen = Imagen;
    }
     
    public int getCodigo_Producto() {
        return Codigo_Producto;
    }

    public void setCodigo_Producto(int Codigo_Producto) {
        this.Codigo_Producto = Codigo_Producto;
    }

    public String getNombre_Producto() {
        return Nombre_Producto;
    }

    public void setNombre_Producto(String Nombre_Producto) {
        this.Nombre_Producto = Nombre_Producto;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public Date getFecha_Vencimiento() {
        return Fecha_Vencimiento;
    }

    public void setFecha_Vencimiento(Date Fecha_Vencimiento) {
        this.Fecha_Vencimiento = Fecha_Vencimiento;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }
    
    
}
