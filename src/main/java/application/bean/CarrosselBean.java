package application.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "carrosselBean")
@ViewScoped
public class CarrosselBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<String> listaImagens;

    public CarrosselBean() {
        listaImagens = new ArrayList<>();
        listaImagens.add("resources/images/1.png");
        listaImagens.add("resources/images/2.png");
        listaImagens.add("resources/images/3.png");
        listaImagens.add("resources/images/4.png");
        listaImagens.add("resources/images/5.png");
    }

    public List<String> getListaImagens() {
        return listaImagens;
    }

    public void setListaImagens(List<String> listaImagens) {
        this.listaImagens = listaImagens;
    }
}
