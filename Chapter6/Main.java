
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book javaBook = BookFactory.createBook(1, "Mastering Java", 15.99, BookType.JAVA);
        Book pythonBook = BookFactory.createBook(2, "Python for Beginners", 25.99, BookType.PYTHON);
        Book webBook1 = BookFactory.createBook(3, "HTML & CSS Crash Course", 18.50, BookType.WEB_DEVELOPMENT);
        Book webBook2 = BookFactory.createBook(4, "Full-Stack Web Dev", 20.50, BookType.WEB_DEVELOPMENT);

        Storage.getInstance().getBooks().add(javaBook);
        Storage.getInstance().getBooks().add(pythonBook);
        Storage.getInstance().getBooks().add(webBook1);
        Storage.getInstance().getBooks().add(webBook2);

        System.out.println("Book list:");
        for (Book book : Storage.getInstance().getBooks()) {
            book.displayInfo();
        }

        Order order1 = new Order(1, "Phuc", javaBook, 2, javaBook.getPrice() * 2);
        Order order2 = new Order(2, "Phuc", pythonBook, 1, pythonBook.getPrice());
        Storage.getInstance().getCarts().add(order1);
        Storage.getInstance().getCarts().add(order2);

        System.out.println("\nCart:");
        for (Order order : Storage.getInstance().getCarts()) {
            System.out.println("Order id: " + order.getOrderId() + ", Customer name: " + order.getCustomerName() +
                    ", Book: " + order.getBook().getTitle() + ", Quantity: " + order.getQuantity() +
                    ", Total price: " + order.getTotalPrice());
        }

        Storage.getInstance().setOrders(Storage.getInstance().getCarts());
        Storage.getInstance().setCarts(new ArrayList<>());

        System.out.println("\nOrder list:");
        for (Order order : Storage.getInstance().getOrders()) {
            System.out.println("Order id: " + order.getOrderId() + ", Customer name: " + order.getCustomerName() +
                    ", Book: " + order.getBook().getTitle() + ", Quantity: " + order.getQuantity() +
                    ", Total price: " + order.getTotalPrice());
        }

        System.out.println("\nCart list after created order:");
        for (Order order : Storage.getInstance().getCarts()) {
            System.out.println("Order id: " + order.getOrderId() + ", Customer name: " + order.getCustomerName() +
                    ", Book: " + order.getBook().getTitle() + ", Quantity: " + order.getQuantity() +
                    ", Total price: " + order.getTotalPrice());
        }
    }
}
