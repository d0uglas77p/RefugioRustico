package application.bean;

import application.model.Cristaleiras;
import org.primefaces.model.ResponsiveOption;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class CristaleirasBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Cristaleiras> cristaleiras;
    private List<ResponsiveOption> responsiveOptions;

    public CristaleirasBean() {
        cristaleiras = new ArrayList<>();
        cristaleiras.add(new Cristaleiras("Cristaleira", "1cristaleira.png", 2500.00));
        cristaleiras.add(new Cristaleiras("Cristaleira com pintura", "2cristaleira_com_pintura.png", 2160.00));
        cristaleiras.add(new Cristaleiras("Cristaleira", "3cristaleira.png", 2050.00));
        cristaleiras.add(new Cristaleiras("Cristaleira com pintura", "4cristaleira_com_pintura.png", 2250.00));

        responsiveOptions = new ArrayList<>();
        responsiveOptions.add(new ResponsiveOption("1360px", 2, 2));
        responsiveOptions.add(new ResponsiveOption("970px", 1, 1));
    }

    public List<Cristaleiras> getCristaleiras() {
        return cristaleiras;
    }

    public void setCristaleiras(List<Cristaleiras> cristaleiras) {
        this.cristaleiras = cristaleiras;
    }

    public List<ResponsiveOption> getResponsiveOptions() {
        return responsiveOptions;
    }

    public void setResponsiveOptions(List<ResponsiveOption> responsiveOptions) {
        this.responsiveOptions = responsiveOptions;
    }
}
