
package VISTA;
import MODELO.*;
/**
 *
 * @author Jorge Sierra
 */
public class TextOrdenador {
    public static void main(String[] args) {
        PORTATIL P1 = new PORTATIL(2, 2309, 1900000);
        SOBREMESA SM1 = new SOBREMESA("Gamer", 3546, 1000000);
        System.out.println(P1.RetornoDatos());
        System.out.println(SM1.RetornoDatos());
    }
}
