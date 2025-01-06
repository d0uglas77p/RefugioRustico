package application.bean;

import application.model.Variedades;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class VariedadesBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Variedades> variedade;

    public VariedadesBean() {
        variedade = new ArrayList<>();
        variedade.add(new Variedades("Arcais com pintura", "1arcais_com_pintura.png", 200));
        variedade.add(new Variedades("Mesinha de jardim", "2mesinha_de_jardim.png", 200));
        variedade.add(new Variedades("Armario com palinha", "3armario_com_palinha.png", 200));
        variedade.add(new Variedades("Cama", "4cama.png", 200));
        variedade.add(new Variedades("Adega ripada", "5adega_ripada.png", 200));
        variedade.add(new Variedades("Arcais com pintura", "6arcais_com_pintura.png", 200));
    }

    public List<Variedades> getVariedade() {
        return variedade;
    }

    public void setVariedade(List<Variedades> variedade) {
        this.variedade = variedade;
    }
}
