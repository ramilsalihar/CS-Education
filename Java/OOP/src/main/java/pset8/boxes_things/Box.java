package pset8.boxes_things;

public class Box implements ToBeStored{
    private double maxWeight;
    private int totalThings = 0;
    private double totalWeight = 0.0;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public double weight() {
        return totalWeight;
    }

    public void add(CD cd){
        if(maxWeight >= (totalWeight + cd.weight())){
            totalWeight += cd.weight();
            totalThings++;
        }
    }
    public void add(Book book){
        if(maxWeight >= (totalWeight + book.weight())){
            totalWeight += book.weight();
            totalThings++;
        }
    }

    @Override
    public String toString() {
        return String.format("Box: %d things, total weight %.1f kg", totalThings, totalWeight);
    }
}
