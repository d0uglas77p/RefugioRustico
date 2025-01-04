package application.bean;

import application.model.Product;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class ProductBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Product> products;

    public ProductBean() {
        products = new ArrayList<>();
        products.add(new Product("Blusa 1", "blusa1.png", 200.00));
        products.add(new Product("Blusa 2", "blusa2.png", 250.15));
        products.add(new Product("Blusa 3", "blusa3.png", 275.00));
        products.add(new Product("Bolsa 1", "bolsa1.png", 60.52));
        products.add(new Product("Bolsa 2", "bolsa2.png", 86.99));
        products.add(new Product("Caixinha", "caixinha.png", 149.99));
        products.add(new Product("Controle 1", "controle1.png", 59.99));
        products.add(new Product("Corrente", "corrente.png", 15.00));
        products.add(new Product("Fone 1", "fone1.png", 65.89));
        products.add(new Product("Fone 2", "fone2.png", 89.99));
        products.add(new Product("Oculos", "oculos.png", 2959));
        products.add(new Product("Relógio 1", "relogio1.png", 14.29));
        products.add(new Product("Relógio 2", "relogio2.png", 36));
        products.add(new Product("Sapato 1", "sapato1.png", 200));
        products.add(new Product("Sapato 2", "sapato2.png", 145.99));
        products.add(new Product("Toalha", "toalha.png", 42.99));
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
