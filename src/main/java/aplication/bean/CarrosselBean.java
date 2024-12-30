package aplication.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class CarrosselBean {
    private List<String> listaImagens;

    public CarrosselBean() {
        listaImagens = new ArrayList<>();
        listaImagens.add("/resources/images/1.png");
        listaImagens.add("/resources/images/2.png");
        listaImagens.add("/resources/images/3.png");
        listaImagens.add("/resources/images/4.png");
        listaImagens.add("/resources/images/5.png");

    }

    public List<String> getListaImagens() {
        return listaImagens;
    }

    public void setListaImagens(List<String> listaImagens) {
        this.listaImagens = listaImagens;
    }
}
