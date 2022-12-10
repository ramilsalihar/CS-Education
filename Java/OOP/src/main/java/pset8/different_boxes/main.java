package pset8.different_boxes;

public class main {
    public static void main(String[] args) {
        MaxWeightBox coffeeBox = new MaxWeightBox(10);

        coffeeBox.add(new Thing("Coffee", 5));
        coffeeBox.add(new Thing("Milk", 5));
        coffeeBox.add(new Thing("Sugar", 5));

        System.out.println(coffeeBox.isInTheBox(new Thing("Coffee", 5)));
        System.out.println(coffeeBox.isInTheBox(new Thing("Milk")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Sugar")));

//        System.out.println(coffeeBox.getMaxWeight());
    }
}
