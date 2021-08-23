package org.primefaces.test;

public class Model {
    String value;

    public Model(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Model with value " + value;
    }
}
