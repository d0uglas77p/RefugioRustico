package application.bean;

import application.model.Aparadores;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class AparadoresBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Aparadores> aparador;

    public AparadoresBean() {
        aparador = new ArrayList<>();
        aparador.add(new Aparadores("Aparador", "1aparador.png", 200));
        aparador.add(new Aparadores("Aparador", "2aparador_rustico_com_pintura.png", 200));
        aparador.add(new Aparadores("Aparador com pintura", "3aparador_com_pintura.png", 200));
    }

    public List<Aparadores> getAparador() {
        return aparador;
    }

    public void setAparador(List<Aparadores> aparador) {
        this.aparador = aparador;
    }
}
