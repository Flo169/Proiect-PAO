import java.util.*;

public class Serviciu {

    private static HashSet<Carte> carti = new HashSet<Carte>();
    private static HashSet<Autor> autori = new HashSet<Autor>();
    private static HashSet<Abonament> abonamente = new HashSet<>();

    public static void adaugareCarte() {

        Scanner scanner = new Scanner(System.in);
        int id, n;
        ArrayList<Integer> autori = new ArrayList<Integer>();

        System.out.print("ID? ");
        id = scanner.nextInt();

        System.out.print("Câți autori? ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("ID autor " + Integer.toString(i + 1) + "? ");
            autori.add(scanner.nextInt());
        }

        Collections.sort(autori);

        Carte c = new Carte();
        c.setId(id);
        c.setAutori(autori);

        carti.add(c);
    }

    public static void afisareCarti() {

        if (carti.size() == 0)
            System.out.print("Nicio carte.\n");
        else {
            for (Carte c : carti) {
                System.out.print("\nID: " + Integer.toString(c.getId()) + "\nAutori:");
                for (int i : c.getAutori())
                    System.out.print(" " + Integer.toString(i));
                System.out.print("\n");
            }
        }
    }

    public static void adaugareAutor() {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int id;
        String nume;

        System.out.print("ID? ");
        id = scanner.nextInt();

        System.out.print("Nume? ");
        nume = scanner.next();

        Autor a = new Autor();
        a.setId(id);
        a.setNume(nume);

        autori.add(a);
    }

    public static void afisareAutori() {

        if (autori.size() == 0)
            System.out.print("Niciun autor.\n");
        else {
            for (Autor a : autori) {
                System.out.print("\nID: " + Integer.toString(a.getId()) + "\nNume: " +
                                 a.getNume() + "\n");
            }
        }
    }

    public static void afisareAutoriCarte(int id) {

        Carte c = new Carte();

        for (Carte d : carti)
            if (d.getId() == id) {
                c = d;
                break;
            }

        for (Integer i : c.getAutori()) {
            for (Autor a : autori)
                if (a.getId() == i)
                    System.out.println(a.getNume());
        }
    }

    public static void stergereCarte(int id) {

        Carte c = new Carte();

        for (Carte d : carti)
            if (d.getId() == id) {
                c = d;
                break;
            }

        carti.remove(c);
    }

    public static void adaugareAbonament() {

        Scanner scanner = new Scanner(System.in);
        int id, idCit, sp, nrp;

        System.out.print("ID? ");
        id = scanner.nextInt();

        System.out.print("ID cititor? ");
        idCit = scanner.nextInt();

        System.out.print("Special (0 sau 1)? ");
        sp = scanner.nextInt();

        if (sp == 1) {
            System.out.print("Nr. puncte? ");
            nrp = scanner.nextInt();

            AbonamentSpecial a = new AbonamentSpecial();
            a.setId(id);
            a.setIdCititor(idCit);
            a.setNrPuncte(nrp);

            abonamente.add(a);
        }
        else {
            Abonament a = new Abonament();
            a.setId(id);
            a.setIdCititor(idCit);

            abonamente.add(a);
        }
    }

    public static void afisareAbonamente() {
        for (Abonament a : abonamente) {
            System.out.print("\nID: " + a.getId() + "\nID cititor: " + a.getIdCititor());
            if (a instanceof AbonamentSpecial) {
                AbonamentSpecial b = (AbonamentSpecial) a;
                System.out.print("\nNr. puncte: " + b.getNrPuncte() + "\n");
            }
        }
    }
}
