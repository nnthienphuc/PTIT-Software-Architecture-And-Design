interface Search {
    int search(Book[] books, String title);
}

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class LinearSearch implements Search {
    @Override
    public int search(Book[] books, String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }
}

class BinarySearch implements Search {
    @Override
    public int search(Book[] books, String title) {
        int left = 0, right = books.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareTo(title);
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

public class MainApp {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Data Structures and Algorithms"),
                new Book("Object Oriented Programming"),
                new Book("Developing Java Applications"),
                new Book("Design Patterns"),
                new Book("Storytelling with Data"),
        };

        java.util.Arrays.sort(books, (a, b) -> a.getTitle().compareTo(b.getTitle()));

        Search linearSearch = new LinearSearch();
        int linearResult = linearSearch.search(books, "Data Structures and Algorithms");
        System.out.println(
                "Linear Search: "
                        + (linearResult != -1 ? "Position: " + linearResult : "Cannot find"));

        Search binarySearch = new BinarySearch();
        int binaryResult = binarySearch.search(books, "Design Patterns");
        System.out.println(
                "Binary Search: "
                        + (binaryResult != -1 ? "Position: " + binaryResult : "Cannot find"));
    }
}
