import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */
        LaLiga team = new LaLiga("Futbol Club Barcelona", "29 November 1899");
        System.out.println(team.toString());
        Team team2 = new Team("Real Madrid Club de Fútbol", "6 March 1902", 647.6);
        System.out.println(team2.toString());
        List<LaLiga> footballteam = new ArrayList<>();
        footballteam.add(team);
        footballteam.add(team2);
        System.out.println(footballteam);
        Object team3 = new LaLiga("Club Atlético de Madrid, S.A.D.", "26 April 1903");
        System.out.println("\n" + team3.toString());
        Object team4 = new Team("Athletic Club", "1898", 101.6);
        System.out.println(team4.toString());

    }
}
