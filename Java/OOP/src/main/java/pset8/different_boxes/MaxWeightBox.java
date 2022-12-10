package pset8.different_boxes;


import java.util.HashSet;

public class MaxWeightBox extends Box{
    private final int maxWeight;
    private int totalWeight = 0;
    private static final HashSet<String> thingHashSet = new HashSet<>();
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void add(Thing thing) {
        if(thing.getWeight() + totalWeight <= maxWeight){
            totalWeight += thing.getWeight();
            thingHashSet.add(thing.getName());
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return thingHashSet.contains(thing.getName());
    }
}
