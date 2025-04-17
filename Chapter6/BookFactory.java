class BookFactory {
    public static Book createBook(int id, String title, double price, BookType type) {
        switch (type) {
            case JAVA:
                return new JavaBook(id, title, price, type);
            case PYTHON:
                return new PythonBook(id, title, price, type);
            case WEB_DEVELOPMENT:
                return new WebDevBook(id, title, price, type);
            default:
                throw new IllegalArgumentException("Invalid book: " + type);
        }
    }
}
