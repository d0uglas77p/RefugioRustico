package aplication.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class CarrosselBannerBean {
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
