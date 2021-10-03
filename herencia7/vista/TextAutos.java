
package vista;
import Modelo.*;
/**
 *
 * @author Jorge Sierra
 */
public class TextAutos {
    public static void main(String[] args) {
        AutosLujos A1 =new AutosLujos( 123224, "Ferrari", 2022, 500000000, 2);
        AutosComp AC1 = new AutosComp( 328328, "MAZDA", 2020, 40000000, 4);
        Vagonetas V1 = new Vagonetas( 764354, "NISSAN", 2010, 15000000, 4);
        Camionetas C1 = new Camionetas(  1000, 4,"DOBLE",983412, "TOYOTA", 2022, 150000000);
        System.out.println("AUTOS LUJOSOS\n" + A1.RetornoDatos());
        System.out.println("AUTOS COMPACTOS\n"+AC1.RetornoDatos());
        System.out.println("VAGONETAS\n"+V1.RetornoDatos());
        System.out.println("CAMIONETA\n"+C1.RetornoDatos());
    }
}
