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
        products.add(new Product("Corrente", "corrente.png", 200));
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
