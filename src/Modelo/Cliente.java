
package Modelo;


public class Cliente {
    
    private int Codigo_Cliente;
    private String Nombre_Cliente;
    private String Sexo;
    private boolean Estado;

    public Cliente() {
    }

    public Cliente(String Nombre_Cliente, String Sexo) {
        this.Nombre_Cliente = Nombre_Cliente;
        this.Sexo = Sexo;
    }
    

    public String getNombre_Cliente() {
        return Nombre_Cliente;
    }

      public int getCodigo_Cliente() {
        return Codigo_Cliente;
    }

    public void setCodigo_Cliente(int Codigo_Cliente) {
        this.Codigo_Cliente = Codigo_Cliente;
    }
    
    public void setNombre_Cliente(String Nombre_Cliente) {
        this.Nombre_Cliente = Nombre_Cliente;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
   
    

   

  
   
      
}
