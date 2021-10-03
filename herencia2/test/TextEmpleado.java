
package test;
import MODELO.*;
/**
 *
 * @author Jorge Sierra
 */
public class TextEmpleado {
    public static void main(String[] args) {
        EMPLEADO E1= new EMPLEADO("RAFA");
        DIRECTIVO D1= new DIRECTIVO("MARIO");
        OPERARIO O1= new OPERARIO("ALFONSO");
        OFICIAL OF1= new OFICIAL("LUIS");
        TECNICO T1= new TECNICO("PABLO");
        System.out.println(E1.RetornoDatos());
        System.out.println(D1.RetornoDatos());
        System.out.println(O1.RetornoDatos());
        System.out.println(OF1.RetornoDatos());
        System.out.println(T1.RetornoDatos());
    }
}
