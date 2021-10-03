
package MODELO;

/**
 *
 * @author Jorge Sierra
 */
public class DIRECTIVO extends EMPLEADO{
    public DIRECTIVO(){
    super();
    }
    public DIRECTIVO(String Nombre){
    super(Nombre);
    }
    @Override
    public String RetornoDatos(){
       return super.RetornoDatos()+" --> DIRECTIVO";
    }
}
