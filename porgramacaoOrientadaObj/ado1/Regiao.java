import java.util.ArrayList;


public class Regiao {
    String nome;
    ArrayList<String> estados = new ArrayList<String>();
    double pib = 0.0;
    public Regiao(String nome){
        this.nome = nome;
       
    }

    public ArrayList<String> getEstados() {
        return estados;
    }

    public void setEstado(String estado){
        this.estados.add(estado);
    }

    public double getPib() {
        return pib;
    }

    public void setPib(double pib) {
        this.pib = pib;
    }
}
