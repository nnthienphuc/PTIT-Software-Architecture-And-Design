enum BookType {
    JAVA,
    PYTHON,
    WEB_DEVELOPMENT
}

abstract class Book {
    protected int id;
    protected String title;
    protected double price;
    protected BookType type;

    public Book(int id, String title, double price, BookType type) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.type = type;
    }

    public abstract void displayInfo();

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public BookType getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(BookType type) {
        this.type = type;
    }
}

class JavaBook extends Book {
    public JavaBook(int id, String title, double price, BookType type) {
        super(id, title, price, type);
    }

    @Override
    public void displayInfo() {
        System.out.println("Java book: " + getTitle() + " | Price: $" + getPrice() + " | ID: " + getId());
    }
}

class PythonBook extends Book {
    public PythonBook(int id, String title, double price, BookType type) {
        super(id, title, price, type);
    }

    @Override
    public void displayInfo() {
        System.out.println("Python book: " + getTitle() + " | Price: $" + getPrice() + " | ID: " + getId());
    }
}

class WebDevBook extends Book {
    public WebDevBook(int id, String title, double price, BookType type) {
        super(id, title, price, type);
    }

    @Override
    public void displayInfo() {
        System.out.println("Web Development book: " + getTitle() + " | Price: $" + getPrice() + " | ID: " + getId());
    }
}
