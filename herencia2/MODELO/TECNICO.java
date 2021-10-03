
package MODELO;

/**
 *
 * @author Jorge Sierra
 */
public class TECNICO extends OPERARIO {

    public TECNICO() {
    }

    public TECNICO(String Nombre) {
        super(Nombre);
    }
    @Override
    public String RetornoDatos(){
       return super.RetornoDatos()+" --> OPERARIO --> TECNICO";
    }
}
