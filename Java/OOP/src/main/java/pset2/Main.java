package pset2;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("John", "Wick", "john@wick.com", 55);
        Student aidarbek = new Student("Aidarbek", "Zamirbekov", "aidar.zamirbekov@alatoo.edu.kg", 86.0, "bachelor");

        Circle baya = new Circle(12.3, "blue");

        System.out.println(baya.getArea());
    }

}   