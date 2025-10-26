class Book {
    String name;
    String author;
    double price;
    String size;
    String type;

    Book() {}

    Book(String name, String author, double price, String size, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.size = size;
        this.type = type;
    }

    Book(Book b) {
        this.name = b.name;
        this.author = b.author;
        this.price = b.price;
        this.size = b.size;
        this.type = b.type;
    }

    void display() {
        System.out.println("Book [name=" + name + ", author=" + author + ", price=" + price 
            + ", size=" + size + ", type=" + type + "]");
    }
}
