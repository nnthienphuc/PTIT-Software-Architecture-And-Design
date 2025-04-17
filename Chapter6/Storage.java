
import java.util.ArrayList;
import java.util.List;

class Storage {
    private static Storage instance;
    private List<Book> books;
    private List<Order> carts;
    private List<Order> orders;

    private Storage() {
        books = new ArrayList<>();
        orders = new ArrayList<>();
        carts = new ArrayList<>();
    }

    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getCarts() {
        return carts;
    }

    public void setCarts(List<Order> carts) {
        this.carts = carts;
    }
}