
package MODELO;
/**
 *
 * @author Jorge Sierra
 */
public class EMPLEADO {
    private String Nombre;
    
    public EMPLEADO(){
    }

    public EMPLEADO(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

   
    public String RetornoDatos() {
        return "EMPLEADO " + "Nombre: " + Nombre ;
    }

   
}
