package suggester;
import models.Ingrediente;
import models.Receita;

import java.util.List;

public abstract class SugestorBase {
    public abstract List<Receita> sugerir(List<Ingrediente> ingredientes);
}


