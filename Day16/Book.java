class Book {

    String title;
    int price;

    // Default constructor
    Book() {
        title = "Not Assigned";
        price = 0;
    }

    // Parameterized constructor
    Book(String t, int p) {
        title = t;
        price = p;
    }

    void show() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", 399);

        b1.show();
        b2.show();
    }
}
