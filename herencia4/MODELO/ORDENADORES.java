
package MODELO;

/**
 *
 * @author Jorge Sierra
 */
public class ORDENADORES {
    private int Codigo;
    private int Precio;

    public ORDENADORES() {
    }

    public ORDENADORES(int Codigo, int Precio) {
        this.Codigo = Codigo;
        this.Precio = Precio;
    }

    public int getCodigo() {
        return Codigo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    
    public String RetornoDatos() {
        return "Codigo=" + this.Codigo + "\n"+
               "Precio=" + this.Precio ;
    }
    
}
