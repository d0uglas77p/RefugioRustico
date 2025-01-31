package application.bean;

import application.model.Aparadores;
import org.primefaces.model.ResponsiveOption;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class AparadoresBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Aparadores> aparadores;
    private List<ResponsiveOption> responsiveOptions;

    public AparadoresBean() {
        aparadores = new ArrayList<>();
        aparadores.add(new Aparadores("Aparador", "1aparador.png", 200));
        aparadores.add(new Aparadores("Aparador", "2aparador_rustico_com_pintura.png", 200));
        aparadores.add(new Aparadores("Aparador com pintura", "3aparador_com_pintura.png", 200));

        responsiveOptions = new ArrayList<>();
        responsiveOptions.add(new ResponsiveOption("1360px", 2, 2));
        responsiveOptions.add(new ResponsiveOption("970px", 1, 1));
    }

    public List<Aparadores> getAparadores() {
        return aparadores;
    }

    public void setAparadores(List<Aparadores> aparadores) {
        this.aparadores = aparadores;
    }

    public List<ResponsiveOption> getResponsiveOptions() {
        return responsiveOptions;
    }

    public void setResponsiveOptions(List<ResponsiveOption> responsiveOptions) {
        this.responsiveOptions = responsiveOptions;
    }
}
