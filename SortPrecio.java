import java.util.Comparator;

public class SortPrecio implements Comparator<Producto>{
    public int compare(Producto p1, Producto p2){
        return -Integer.valueOf(p1.getPrecio()).compareTo(p2.getPrecio());
    }
}
