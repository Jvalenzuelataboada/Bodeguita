
package Modelo;


public class Cliente {
    private int Codigo_Cliente;
    private String Nombre_Cliente;
    private boolean Sexo;
    private boolean Estado;

    public Cliente() {
    }
    public Cliente(int Codigo_Cliente, String Nombre_Cliente, boolean Sexo, boolean Estado) {
        this.Codigo_Cliente = Codigo_Cliente;
        this.Nombre_Cliente = Nombre_Cliente;
        this.Sexo = Sexo;
        this.Estado = Estado;
    }

    public int getCodigo_Cliente() {
        return Codigo_Cliente;
    }

  

    public void setCodigo_Cliente(int Codigo_Cliente) {
        this.Codigo_Cliente = Codigo_Cliente;
    }

    public String getNombre_Cliente() {
        return Nombre_Cliente;
    }

    public void setNombre_Cliente(String Nombre_Cliente) {
        this.Nombre_Cliente = Nombre_Cliente;
    }

    public boolean isSexo() {
        return Sexo;
    }

    public void setSexo(boolean Sexo) {
        this.Sexo = Sexo;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
      
}
