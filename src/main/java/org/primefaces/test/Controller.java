package org.primefaces.test;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class Controller {

    public boolean configurationExists(Model model) {
        return model.value != null;
    }

}
