
/**
    @author: José Pablo Kiesling Lange & Andrés Estuardo Montoya Wilhelm
    Nombre del programa: Producto.java
    @version: 
        - Creación: 05/11/2021
        - Última modificación: 07/11/2021

    Interface que tiene como fin proporcionar las funciones abstractas de un producto
    */
public interface Producto{
    int precio=0;
    String serie="";
    String marca="";
    String fechaFabricacion="";
    String marcadorAR="";
    String tipo="";
    public String[] funciones();
    public String probar(int accion, String cosa);
    public int getPrecio();
    public String getMarca();
    public String getFecha();
    public String getTipo();
    public String getSerie();
    public String getMarcadorAR();
}
