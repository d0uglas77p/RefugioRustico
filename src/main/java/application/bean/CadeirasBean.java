package application.bean;

import application.model.Cadeiras;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class CadeirasBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Cadeiras> cadeira;

    public CadeirasBean() {
        cadeira = new ArrayList<>();
        cadeira.add(new Cadeiras("Cadeira de tirar botas", "1cadeira_de_tirar_botas.png", 200));
        cadeira.add(new Cadeiras("Cadeira pavão", "2cadeira_pavao.png", 200));
    }

    public List<Cadeiras> getCadeira() {
        return cadeira;
    }

    public void setCadeiras(List<Cadeiras> cadeira) {
        this.cadeira = cadeira;
    }
}
