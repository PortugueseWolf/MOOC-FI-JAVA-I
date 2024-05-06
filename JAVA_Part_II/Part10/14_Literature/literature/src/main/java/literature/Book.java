package literature;

public class Book implements Comparable<Book> {
    private String name;
    private int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " (recommended for " + age + " year-olds or older)";
    }

    @Override
    public int compareTo(Book book) {
        if (this.age == book.getAge()) {
            return 0;
        }
        if (this.age > book.getAge()) {
            return 1;
        }
        return -1;
    }
}
