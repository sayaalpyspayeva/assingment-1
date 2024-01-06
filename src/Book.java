class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Reader {
    String fullName;
    int libraryCardNumber;
    String faculty;
    String dateOfBirth;
    String phone;

    public Reader(String fullName, int libraryCardNumber, String faculty, String dateOfBirth, String phone) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " took " + numberOfBooks + " books");
    }

    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " took books: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " took books: ");
        for (Book book : books) {
            System.out.print(book.title + " by " + book.author + ", ");
        }
        System.out.println();
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " returned " + numberOfBooks + " books");
    }

    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " returned books: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " returned books: ");
        for (Book book : books) {
            System.out.print(book.title + " by " + book.author + ", ");
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Saya", 230882, "CyberSecurity", "05/05/2005", "87779758606");
        readers[0].takeBook(3);
        readers[0].takeBook("Adventures", "Dictionary", "Encyclopedia");
        readers[0].takeBook(new Book("Adventures", "Author1"), new Book("Dictionary", "Author2"), new Book("Encyclopedia", "Author3"));
    }
}

