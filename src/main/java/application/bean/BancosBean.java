package application.bean;

import application.model.Bancos;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class BancosBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Bancos> banco;

    public BancosBean() {
        banco = new ArrayList<>();
        banco.add(new Bancos("Jogo de banco ipê", "1jogo_de_banco_ipe.png", 200));
        banco.add(new Bancos("Banco", "2banco.png", 200));
        banco.add(new Bancos("Banco de jardim", "3banco_de_jardim.png", 200));
        banco.add(new Bancos("Jogo de banco", "4jogo_de_banco.png", 200));
        banco.add(new Bancos("Banco de jardim", "5banco_de_jardim.png", 200));
    }

    public List<Bancos> getBanco() {
        return banco;
    }

    public void setBanco(List<Bancos> banco) {
        this.banco = banco;
    }
}
