package application.bean;

import application.model.Cristaleiras;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class CristaleirasBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Cristaleiras> cristaleira;

    public CristaleirasBean() {
        cristaleira = new ArrayList<>();
        cristaleira.add(new Cristaleiras("Cristaleira", "1cristaleira.png", 200));
        cristaleira.add(new Cristaleiras("Cristaleira com pintura", "2cristaleira_com_pintura.png", 200));
        cristaleira.add(new Cristaleiras("Cristaleira", "3cristaleira.png", 200));
        cristaleira.add(new Cristaleiras("Cristaleira com pintura", "4cristaleira_com_pintura.png", 200));
    }

    public List<Cristaleiras> getCristaleira() {
        return cristaleira;
    }

    public void setCristaleira(List<Cristaleiras> cristaleira) {
        this.cristaleira = cristaleira;
    }
}
