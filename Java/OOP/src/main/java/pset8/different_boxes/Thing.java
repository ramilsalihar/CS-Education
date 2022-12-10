package pset8.different_boxes;

import java.util.Objects;

public class Thing {
    private String name;
    private double weight;

    public Thing(String name, double weight) {
        this.name = name;
        if (weight < 0){
            throw new IllegalArgumentException();
        }
        this.weight = weight;
    }

    public Thing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Thing thing = (Thing) o;

        if (Double.compare(thing.getWeight(), getWeight()) != 0) return false;
        return getName() != null ? getName().equals(thing.getName()) : thing.getName() == null;
    }
}