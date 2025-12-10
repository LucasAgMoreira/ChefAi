package models;
import java.util.List;

public class Receita {
    private String nome;
    private List<String> ingredientes;
    private String modoPreparo;
    private int tempo;

    public Receita(String nome, List<String> ingredientes, String modoPreparo, int tempo) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.modoPreparo = modoPreparo;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public int getTempo() {
        return tempo;
    }
}


