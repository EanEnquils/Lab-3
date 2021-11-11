import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
        Student student = new Student(new Osoba("Ivan", "Engels", 59386), WydzialEnum.PROGRAMOWANIE);
        Student student1 = new Student(new Osoba("John", "Basta", 59547), WydzialEnum.PROGRAMOWANIE);
        Student student2 = new Student(new Osoba("Olaf", "Oktyn", 59548), WydzialEnum.LOGISTYKA);
        Student student3 = new Student(new Osoba("Vadym", "Udich", 59354), WydzialEnum.PROGRAMOWANIE);
        Student student4 = new Student(new Osoba("Lakt", "Odlo", 59395), WydzialEnum.LOGISTYKA);
        ArrayList<Student> friends = new <Student>ArrayList();
        friends.add(student);
        friends.add(student1);
        friends.add(student2);
        friends.add(student3);
        friends.add(student4);
        for (Student student5 : friends) {
            System.out.println(student5.toString());
        }

    }
}








