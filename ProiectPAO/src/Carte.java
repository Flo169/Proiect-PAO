import java.util.*;

public class Carte {
    private int id;
    ArrayList<Integer> autori;  // id-urile autorilor, ordonate crescător

    public int getId() {
        return id;
    }

    public ArrayList<Integer> getAutori() {
        return autori;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setAutori(ArrayList<Integer> a) {
        this.autori = a;
    }
}
