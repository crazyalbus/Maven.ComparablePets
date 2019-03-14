package io.zipcoder;

import java.util.Comparator;

public class TypeComparator implements Comparator<Pet> {

    public int compare(Pet o1, Pet o2) {

        return (o1.getType()).compareTo(o2.getType());
    }
}
