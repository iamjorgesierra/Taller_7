
package MODELO;

/**
 *
 * @author Jorge Sierra
 */
public class OFICIAL extends OPERARIO {

    public OFICIAL() {
    }

    public OFICIAL(String Nombre) {
        super(Nombre);
    }
    @Override
    public String RetornoDatos(){
       return super.RetornoDatos()+" --> OPERARIO --> OFICIAL";
    }
}
