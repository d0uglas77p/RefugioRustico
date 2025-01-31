package application.bean;

import application.model.Variedades;
import org.primefaces.model.ResponsiveOption;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class VariedadesBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Variedades> variedades;
    private List<ResponsiveOption> responsiveOptions;

    public VariedadesBean() {
        variedades = new ArrayList<>();
        variedades.add(new Variedades("Arcais com pintura", "1arcais_com_pintura.png", 200));
        variedades.add(new Variedades("Mesinha de jardim", "2mesinha_de_jardim.png", 200));
        variedades.add(new Variedades("Armario com palinha", "3armario_com_palinha.png", 200));
        variedades.add(new Variedades("Cama", "4cama.png", 200));
        variedades.add(new Variedades("Adega ripada", "5adega_ripada.png", 200));
        variedades.add(new Variedades("Arcais com pintura", "6arcais_com_pintura.png", 200));

        responsiveOptions = new ArrayList<>();
        responsiveOptions.add(new ResponsiveOption("1150px", 1, 1));
    }

    public List<Variedades> getVariedades() {
        return variedades;
    }

    public void setVariedades(List<Variedades> variedades) {
        this.variedades = variedades;
    }

    public List<ResponsiveOption> getResponsiveOptions() {
        return responsiveOptions;
    }

    public void setResponsiveOptions(List<ResponsiveOption> responsiveOptions) {
        this.responsiveOptions = responsiveOptions;
    }
}
