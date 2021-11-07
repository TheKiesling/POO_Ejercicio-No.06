import java.util.Comparator;

public class SortMarca implements Comparator<Producto>{
    public int compare(Producto p1, Producto p2){
        return p1.getMarca().compareTo(p2.getMarca());
    }
}
