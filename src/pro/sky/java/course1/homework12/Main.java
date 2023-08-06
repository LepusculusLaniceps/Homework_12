package pro.sky.java.course1.homework12;

public class Main {
    public static void main(String[] args) {
        Author steinbeck = new Author("Джон", "Стейнбек");
        Author keyes = new Author("Дэниел", "Киз");
        Author orwell = new Author("Джордж", "Оруэлл");

        Book ofMiceAndMen = new Book("О мышах и людях", steinbeck, 1937);
        Book flowersForAlgernon = new Book("Цветы для Элджернона", keyes, 1966);
        Book nineteenEightyFour = new Book("1984", orwell, 1956);

        printBook(ofMiceAndMen);
        printBook(flowersForAlgernon);
        printBook(nineteenEightyFour);


        nineteenEightyFour.setPublicationYear(2020);
        printBook(nineteenEightyFour);

    }
    private static void printBook(Book book) {
        System.out.println(book.getName() + " " + book.getPublicationYear() + " " + book.getAuthor().getFirstName() + " " + book.getAuthor().getSurname());

    }
}