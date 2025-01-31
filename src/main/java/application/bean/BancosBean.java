package application.bean;

import application.model.Bancos;
import org.primefaces.model.ResponsiveOption;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class BancosBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Bancos> bancos;
    private List<ResponsiveOption> responsiveOptions;

    public BancosBean() {
        bancos = new ArrayList<>();
        bancos.add(new Bancos("Banco", "2banco.png", 200));
        bancos.add(new Bancos("Banco de jardim", "3banco_de_jardim.png", 200));
        bancos.add(new Bancos("Jogo de banco", "4jogo_de_banco.png", 200));
        bancos.add(new Bancos("Jogo de banco ipê", "1jogo_de_banco_ipe.png", 200));
        bancos.add(new Bancos("Banco de jardim", "5banco_de_jardim.png", 200));

        responsiveOptions = new ArrayList<>();
        responsiveOptions.add(new ResponsiveOption("1355px", 1, 1));
    }

    public List<Bancos> getBancos() {
        return bancos;
    }

    public void setBancos(List<Bancos> bancos) {
        this.bancos = bancos;
    }

    public List<ResponsiveOption> getResponsiveOptions() {
        return responsiveOptions;
    }

    public void setResponsiveOptions(List<ResponsiveOption> responsiveOptions) {
        this.responsiveOptions = responsiveOptions;
    }
}