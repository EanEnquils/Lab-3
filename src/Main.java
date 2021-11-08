import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
        Student[] students = new Student [3];
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.Imie = "Ivan";
        s1.Nazwisko = "Engels";
        s1.age = 26;
        s1.young = true;
        s1.displayInfo();
        s2.Imie = "Marek";
        s2.Nazwisko = "Kozłow";
        s2.age = 17;
        s2.young = true;
        s2.displayInfo();
        s3.Imie = "Petro";
        s3.Nazwisko = "Beska";
        s3.age = 34;
        s3.young = true;
        s3.displayInfo();



        for (int i = 0;i >= students.length;++i){

          System.out.println(students.length);
        }



    }
}