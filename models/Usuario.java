package models;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private List<Ingrediente> ingredientes;

    public Usuario() {
        ingredientes = new ArrayList<>();
    }

    public void addIngrediente(Ingrediente ing) {
        ingredientes.add(ing);
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }
}

