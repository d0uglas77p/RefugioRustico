package application.model;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;

@ViewScoped
@ManagedBean
public class Variedades implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String imageName;
    private double preco;

    public Variedades(String name, String imageName, double preco) {
        this.name = name;
        this.imageName = imageName;
        this.preco = preco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
