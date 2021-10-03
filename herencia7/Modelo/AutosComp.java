
package Modelo;

/**
 *
 * @author Jorge Sierra
 */
public class AutosComp extends AutosLujos {

    public AutosComp() {
    }

    public AutosComp(int NumSerieMotor, String Marca, int Año, int Precio, int CantidadPasajeros) {
        super(NumSerieMotor, Marca, Año, Precio, CantidadPasajeros);
    }

    @Override
    public String toString() {
        return  super.RetornoDatos();
    }
    
}
