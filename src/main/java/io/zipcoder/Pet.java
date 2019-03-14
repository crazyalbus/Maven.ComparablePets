package io.zipcoder;

import java.util.Comparator;

public abstract class Pet implements Comparable<Pet>{

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

    public int compareTo(Pet o) {
        return this.getName().compareTo(o.getName());
    }

}
