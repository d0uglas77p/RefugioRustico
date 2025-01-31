package application.model;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.text.DecimalFormat;

@ManagedBean
@ViewScoped
public class Cristaleiras implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private String imagem;
    private double preco;

    public Cristaleiras(String nome, String imagem, double preco) {
        this.nome = nome;
        this.imagem = imagem;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getPreco() {
        DecimalFormat df = new DecimalFormat("###,##0.00");
        return df.format(preco);
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
