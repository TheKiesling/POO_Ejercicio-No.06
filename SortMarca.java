/**
    @author: José Pablo Kiesling Lange & Andrés Estuardo Montoya Wilhelm
    Nombre del programa: SortMarca.java
    @version: 
        - Creación: 07/11/2021
        - Última modificación: 07/11/2021

    Clase que tiene como fin de comparar strings
    */
import java.util.Comparator;

public class SortMarca implements Comparator<Producto>{
    public int compare(Producto p1, Producto p2){
        return p1.getMarca().compareTo(p2.getMarca());
    }
}
