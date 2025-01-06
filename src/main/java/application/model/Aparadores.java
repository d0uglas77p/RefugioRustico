package application.model;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.text.DecimalFormat;

@ManagedBean
@ViewScoped
public class Aparadores implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String imageName;
    private double preco;

    public Aparadores(String name, String imageName, double preco) {
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

    public String getPreco() {
        DecimalFormat df = new DecimalFormat("###,##0.00");
        return df.format(preco);
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
