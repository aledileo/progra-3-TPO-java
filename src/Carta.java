import java.util.HashMap;

public class Carta {

    HashMap<palos, Integer> paloValor = new HashMap<>();

    public enum palos {
        Espada,
        Oro,
        Copa,
        Basto
    };

    private palos palo;
    public int numero;

    private int beneficio;

    public void setPaloValor(HashMap paloValor) {
        this.paloValor = paloValor;
    }

    public void setPalo(palos palo) {
        this.palo = palo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }

    public int getNumero() {
        return numero;
    }

    public int getBeneficio() {
        return beneficio;
    }

    public palos getPalo() {
        return palo;
    }

    public Carta(palos x, int y, int z) {
        setPalo(x);
        setNumero(y);
        setBeneficio(z);

        HashMap<palos, Integer> temp = new HashMap<>();
        temp.put(palos.Oro, 6);
        temp.put(palos.Espada, 5);
        temp.put(palos.Basto, 3);
        temp.put(palos.Copa, 2);
        setPaloValor(temp);
    }

    public int getValor() {
        return getPaloValorAsInt() + getNumero() + getBeneficio();
    }

    public int getPaloValorAsInt() {
        return this.paloValor.get(getPalo());
    }
    public String getNumeroAsString() {
        return Integer.toString(this.numero);
    }

    public String getBeneficioAsString() {
        return Integer.toString(this.beneficio);
    }
    public String getPaloAsString() {
        return this.palo.toString();
    }

    public String toString() {
        return "{ " + getPaloAsString() + ", " + getNumeroAsString() + ", " + getBeneficioAsString() + " }";
    }
}
