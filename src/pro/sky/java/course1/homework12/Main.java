package pro.sky.java.course1.homework12;

public class Main {
    public static void main(String[] args) {
        Author steinbeck = new Author("Джон", "Стейнбек");
        Author keyes = new Author("Дэниел", "Киз");
        Author orwell = new Author("Джордж", "Оруэлл");

        Book ofMiceAndMen = new Book("О мышах и людях", steinbeck, 1937);
        Book flowersForAlgernon = new Book("Цветы для Элджернона", keyes, 1966);
        Book nineteenEightyFour = new Book("1984", orwell, 1956);

        System.out.println(ofMiceAndMen.getName() + " " + ofMiceAndMen.getPublicationYear() + " " + ofMiceAndMen.getAuthor().getFirstName() + " " + ofMiceAndMen.getAuthor().getSurname());
        System.out.println(flowersForAlgernon.getName() + " " + flowersForAlgernon.getPublicationYear() + " " + flowersForAlgernon.getAuthor().getFirstName() + " " + flowersForAlgernon.getAuthor().getSurname());
        System.out.println(nineteenEightyFour.getName() + " " + nineteenEightyFour.getPublicationYear() + " " + nineteenEightyFour.getAuthor().getFirstName() + " " + nineteenEightyFour.getAuthor().getSurname());
        nineteenEightyFour.setPublicationYear(2020);
        System.out.println("nineteenEightyFour.getPublicationYear() = " + nineteenEightyFour.getPublicationYear());


    }
}