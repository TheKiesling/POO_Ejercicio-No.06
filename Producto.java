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
}
