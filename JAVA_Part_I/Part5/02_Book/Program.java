public class Program {

    public static void main(String[] args) {
        Book book = new Book("J. K. Rowling", "Harry Potter and the Sorcerer's Stone", 223);
        System.out.println(book.getAuthor());
        System.out.println(book.getName());
        System.out.println(book.getPages());
        System.out.println(book);
    }
}