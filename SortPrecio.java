/**
    @author: José Pablo Kiesling Lange & Andrés Estuardo Montoya Wilhelm
    Nombre del programa: SortPRecio.java
    @version: 
        - Creación: 07/11/2021
        - Última modificación: 07/11/2021

    Clase que tiene como fin de comparar precios
    */
import java.util.Comparator;

public class SortPrecio implements Comparator<Producto>{
    public int compare(Producto p1, Producto p2){
        return -Integer.valueOf(p1.getPrecio()).compareTo(p2.getPrecio());
    }
}
