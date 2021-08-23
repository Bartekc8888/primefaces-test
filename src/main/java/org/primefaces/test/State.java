package org.primefaces.test;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.HashMap;
import java.util.Map;

@ManagedBean
@ApplicationScoped
public class State {
    public Map<String, Model> models;

    public State() {
        this.models = new HashMap<String, Model>() {
            @Override
            public Model put(String key, Model value) {
                System.out.println("Value put in map " + value.toString());
                return super.put(key, value);
            }
        };
        this.models.put("key", new Model("Initial value"));
    }

    public Map<String, Model> getModels() {
        return models;
    }

    public void setModels(Map<String, Model> models) {
        this.models = models;
    }
}
