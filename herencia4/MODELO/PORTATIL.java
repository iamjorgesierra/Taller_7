
package MODELO;

/**
 *
 * @author Jorge Sierra
 */
public class PORTATIL extends ORDENADORES {
    private int Peso;

    public PORTATIL() {
        super();
    }

    public PORTATIL(int Peso, int Codigo, int Precio) {
        super(Codigo, Precio);
        this.Peso = Peso;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    @Override
    public String RetornoDatos() {
        return "PORTATIL. " + " Peso: " + this.Peso +" kg"+ "\n"+
               super.RetornoDatos()+"\n"+
               "Ideal para sus viajes.";
    }
}
