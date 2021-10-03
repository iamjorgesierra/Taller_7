
package MODELO;

/**
 *
 * @author Jorge Sierra
 */
public class OPERARIO extends EMPLEADO{

    public OPERARIO() {
        super();
    }
    public OPERARIO(String Nombre){
        super(Nombre);
    }
    @Override
    public String RetornoDatos(){
       return super.RetornoDatos()+" --> OPERARIO";
    }
}

