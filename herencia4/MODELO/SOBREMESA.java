
package MODELO;

/**
 *
 * @author Jorge Sierra
 */
public class SOBREMESA extends ORDENADORES {
    private String TipoTorre;

    public SOBREMESA() {
        super();
    }

    public SOBREMESA(String TipoTorre, int Codigo, int Precio) {
        super(Codigo, Precio);
        this.TipoTorre = TipoTorre;
    }

    public String getTipoTorre() {
        return TipoTorre;
    }

    public void setTipoTorre(String TipoTorre) {
        this.TipoTorre = TipoTorre;
    }

    @Override
    public String RetornoDatos() {
        return "SOBREMESA. " + " TipoTorre: " + this.TipoTorre +"\n"+
               super.RetornoDatos()+"\n"+
               "Es el que más pesa, pero el que menos cuesta." ;
    }
    
}
