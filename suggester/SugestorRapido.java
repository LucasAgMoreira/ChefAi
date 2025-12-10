package suggester;
import models.Ingrediente;
import models.Receita;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SugestorRapido extends SugestorBase {

    @Override
    public List<Receita> sugerir(List<Ingrediente> ingredientesUsuario) {

        List<Receita> receitas = new ArrayList<>();

        receitas.add(new Receita(
                "Omelete Rápido",
                Arrays.asList("2 ovos", "sal", "temperos"),
                "Bata os ovos, tempere e frite em fogo médio.",
                5
        ));

        receitas.add(new Receita(
                "Macarrão Alho e Óleo",
                Arrays.asList("200g de macarrão", "2 dentes de alho", "óleo", "sal"),
                "Cozinhe o macarrão e refogue o alho. Misture e sirva.",
                15
        ));

        receitas.add(new Receita(
                "Torrada com Manteiga",
                Arrays.asList("pão", "manteiga"),
                "Passe manteiga no pão e torre rapidamente.",
                3
        ));

        return receitas;
    }
}

