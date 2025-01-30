package application.bean;

import application.model.Mesas;
import org.primefaces.model.ResponsiveOption;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "mesasBean")
@ViewScoped
public class MesasBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Mesas> mesas;
    private List<ResponsiveOption> responsiveOptions;

    public MesasBean() {
        mesas = new ArrayList<>();
        mesas.add(new Mesas("Mesa de Chipandelle", "1mesa_de_chipandelle.png", 200));
        mesas.add(new Mesas("Mesa", "2mesa.png", 200));
        mesas.add(new Mesas("Mesa Redonda", "3mesa_redonda.png", 200));
        mesas.add(new Mesas("Mesa Pé X", "4mesa_pe_x.png", 200));

        responsiveOptions = new ArrayList<>();
        responsiveOptions.add(new ResponsiveOption("1360px", 2, 2));
        responsiveOptions.add(new ResponsiveOption("970px", 1, 1));
    }

    public List<Mesas> getMesas() {
        return mesas;
    }

    public void setMesas(List<Mesas> mesas) {
        this.mesas = mesas;
    }

    public List<ResponsiveOption> getResponsiveOptions() {
        return responsiveOptions;
    }

    public void setResponsiveOptions(List<ResponsiveOption> responsiveOptions) {
        this.responsiveOptions = responsiveOptions;
    }
}