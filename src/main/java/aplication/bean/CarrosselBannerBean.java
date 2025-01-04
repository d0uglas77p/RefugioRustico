package aplication.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class CarrosselBannerBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<String> listaBanner;

    public CarrosselBannerBean() {
        listaBanner = new ArrayList<>();
        listaBanner.add("/resources/images/banner.png");
        listaBanner.add("/resources/images/banner2.png");
    }

    public List<String> getListaBanner() {
        return listaBanner;
    }

    public void setListaBanner(List<String> listaBanner) {
        this.listaBanner = listaBanner;
    }
}
