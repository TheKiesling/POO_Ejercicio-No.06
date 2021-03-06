import java.text.ParseException;
/**
    @author: José Pablo Kiesling Lange & Andrés Estuardo Montoya Wilhelm
    Nombre del programa: SortFecha.java
    @version: 
        - Creación: 07/11/2021
        - Última modificación: 07/11/2021

    Clase que tiene como fin comparar fechas
    */
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class SortFecha implements Comparator<Producto>{
    public int compare(Producto p1, Producto p2){
        SimpleDateFormat format = new SimpleDateFormat("DD/MM/yyyy");
        Date fecha1=null,fecha2=null;
        try{
        fecha1 = format.parse(p1.getFecha());
        fecha2 = format.parse(p2.getFecha());
        } catch(ParseException e){

        }

        return -fecha1.compareTo(fecha2);
    }
}
