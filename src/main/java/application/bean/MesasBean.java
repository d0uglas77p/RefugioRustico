package application.bean;

import application.model.Mesas;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class MesasBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Mesas> mesa;

    public MesasBean() {
        mesa = new ArrayList<>();
        mesa.add(new Mesas("Mesa de Chipandelle", "1mesa_de_chipandelle.png", 200));
        mesa.add(new Mesas("Mesa", "2mesa.png", 200));
        mesa.add(new Mesas("Mesa Redonda", "3mesa_redonda.png", 200));
        mesa.add(new Mesas("Mesa Pé X", "4mesa_pe_x.png", 200));
        mesa.add(new Mesas("Mesa", "5mesa.png", 200));
    }

    public List<Mesas> getMesa() {
        return mesa;
    }

    public void setMesa(List<Mesas> mesa) {
        this.mesa = mesa;
    }

}
