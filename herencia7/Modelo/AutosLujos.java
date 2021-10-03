
package Modelo;

/**
 *
 * @author Jorge Sierra
 */
public class AutosLujos extends Autos{
    private int CantidadPasajeros;

    public AutosLujos() {
        super();
    }

    public AutosLujos(int NumSerieMotor, String Marca, int Año, int Precio, int CantidadPasajeros) {
        super(NumSerieMotor, Marca, Año, Precio);
        this.CantidadPasajeros=CantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return CantidadPasajeros;
    }

    public void setCantidadPasajeros(int CantidadPasajeros) {
        this.CantidadPasajeros = CantidadPasajeros;
    }

    @Override
    public String RetornoDatos() {
        return  "Cantidad Pasajeros: " + this.CantidadPasajeros + "\n"+
                super.RetornoDatos();
    }
    
}
