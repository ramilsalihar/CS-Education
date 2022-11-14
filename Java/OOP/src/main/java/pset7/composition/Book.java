package pset7.composition;

public class Book {
    final private String name;
    final private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String authorsName = "";

        int numberOfPunct = authors.length - 1;
        for(Author author: authors){
            authorsName += author.toString();
            authorsName += ",";
        }
        authorsName = authorsName.substring(0, authorsName.length()-1);

        return String.format(
                "Book[name=%s,authors=[%s],price=%.0f,qty=%d]",
                name,
                authorsName.toString(),
                price,
                qty
                );
    }

    public String getAuthorNames(){
        String nameOfAuthors = "";
        int numPunct = authors.length - 1;

        for(Author author: authors){
            nameOfAuthors += author.getName();
            nameOfAuthors += ",";
        }
        nameOfAuthors = nameOfAuthors.substring(0, nameOfAuthors.length()-1);

        return nameOfAuthors;
    }
}
