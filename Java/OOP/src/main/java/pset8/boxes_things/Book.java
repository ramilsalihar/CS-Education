package pset8.boxes_things;

public class Book implements ToBeStored{
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", writer, name);
    }

    @Override
    public double weight() {
        return weight;
    }
}
