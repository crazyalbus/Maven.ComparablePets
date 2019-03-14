package io.zipcoder;

public abstract class Pet implements Comparable {

    String name;
    String type;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Pet() {
        this.name = "";
        this.type = "";
    }

    public abstract String speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
