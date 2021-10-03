
package Modelo;

/**
 *
 * @author Jorge Sierra
 */
public class Autos {
    private int NumSerieMotor;
    private String Marca;
    private int Año;
    private int Precio;
    
    public Autos(){
    }
    public Autos(int NumSerieMotor, String Marca, int Año, int Precio) {
        this.NumSerieMotor = NumSerieMotor;
        this.Marca = Marca;
        this.Año = Año;
        this.Precio = Precio;
    }

    public int getNumSerieMotor() {
        return NumSerieMotor;
    }

    public String getMarca() {
        return Marca;
    }

    public int getAño() {
        return Año;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setNumSerieMotor(int NumSerieMotor) {
        this.NumSerieMotor = NumSerieMotor;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String RetornoDatos() {
        return  "Numero Serie del Motor: " + this.NumSerieMotor + "\n"+
                "Marca: " + this.Marca + "\n"+
                "Año: " + this.Año + "\n"+
                "Precio: " + this.Precio ;
    }
    
    
}
