
package Modelo;

/**
 *
 * @author Jorge Sierra
 */
public class Camionetas extends Autos{
    private int PesoCarga;
    private int NumEjes;
    private String Rodada;

    public Camionetas() {
        super();
    }

    public Camionetas(int PesoCarga, int NumEjes, String Rodada, int NumSerieMotor, String Marca, int Año, int Precio) {
        super(NumSerieMotor, Marca, Año, Precio);
        this.PesoCarga = PesoCarga;
        this.NumEjes = NumEjes;
        this.Rodada = Rodada;
    }

    public int getPesoCarga() {
        return PesoCarga;
    }

    public int getNumEjes() {
        return NumEjes;
    }

    public String getRodada() {
        return Rodada;
    }

    public void setPesoCarga(int PesoCarga) {
        this.PesoCarga = PesoCarga;
    }

    public void setNumEjes(int NumEjes) {
        this.NumEjes = NumEjes;
    }

    public void setRodada(String Rodada) {
        this.Rodada = Rodada;
    }

    @Override
    public String RetornoDatos() {
        return  "PesoCarga: " + this.PesoCarga +" Kg"+ "\n"+
                "NumEjes: " + this.NumEjes + "\n"+
                "Rodada: " + this.Rodada +"\n"+
                super.RetornoDatos();
    }
    
}
