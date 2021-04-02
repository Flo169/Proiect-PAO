import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i, aux;

        System.out.print("0: ieșire\n1: adăugare carte\n2: afișare cărți\n3: adăugare autor" +
                         "\n4: afișare autori\n5: pentru o carte, afișarea numelor autorilor " +
                         "prezenți în baza de date\n6: ștergere carte\n7: adăugare abonament " +
                         "(inclusiv special)\n8: afișare abonamente\n\n");

        i = scanner.nextInt();

        while (i != 0) {
            switch (i) {
                case 1:
                    Serviciu.adaugareCarte();
                    System.out.println("Carte adăugată.");
                    break;
                case 2:
                    Serviciu.afisareCarti();
                    break;
                case 3:
                    Serviciu.adaugareAutor();
                    System.out.println("Autor adăugat.");
                    break;
                case 4:
                    Serviciu.afisareAutori();
                    break;
                case 5:
                    System.out.print("ID-ul cărții? ");
                    aux = scanner.nextInt();
                    Serviciu.afisareAutoriCarte(aux);
                    break;
                case 6:
                    System.out.print("Id-ul cărții? ");
                    aux = scanner.nextInt();
                    Serviciu.stergereCarte(aux);
                    System.out.println("Carte ștearsă.");
                    break;
                case 7:
                    Serviciu.adaugareAbonament();
                    System.out.println("Abonament adăugat.");
                    break;
                case 8:
                    Serviciu.afisareAbonamente();
                    break;
                default:
                    System.out.println("Comandă invalidă!");
            }

            i = scanner.nextInt();
        }
    }
}
