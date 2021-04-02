import java.util.*;

public class Cititor {
    private int id;
    private HashSet<Abonament> abonamente;

    public int getId() {
        return id;
    }

    public HashSet<Abonament> getAbonamente() {
        return abonamente;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setAbonamente(HashSet<Abonament> a) {
        this.abonamente = a;
    }
}
