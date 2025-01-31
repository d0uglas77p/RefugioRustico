package application.bean;

import application.model.Cadeiras;
import org.primefaces.model.ResponsiveOption;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class CadeirasBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Cadeiras> cadeiras;
    private List<ResponsiveOption> responsiveOptions;

    public CadeirasBean() {
        cadeiras = new ArrayList<>();
        cadeiras.add(new Cadeiras("Cadeira de tirar botas", "1cadeira_de_tirar_botas.png", 200));
        cadeiras.add(new Cadeiras("Cadeira pavão", "2cadeira_pavao.png", 200));

        responsiveOptions = new ArrayList<>();
        responsiveOptions.add(new ResponsiveOption("1360px", 2, 2));
        responsiveOptions.add(new ResponsiveOption("970px", 1, 1));
    }

    public List<Cadeiras> getCadeiras() {
        return cadeiras;
    }

    public void setCadeiras(List<Cadeiras> cadeiras) {
        this.cadeiras = cadeiras;
    }

    public List<ResponsiveOption> getResponsiveOptions() {
        return responsiveOptions;
    }

    public void setResponsiveOptions(List<ResponsiveOption> responsiveOptions) {
        this.responsiveOptions = responsiveOptions;
    }
}
