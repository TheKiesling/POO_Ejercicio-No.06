public class Telefono_fijo implements Producto, Telefono{
    public String[] funciones(){
        
    }
    public String probar(){

    }
    public int getPrecio(){

    }
    public String getMarca(){
        
    }
    public String mover(String lugar){
        return "Se ha movido el SmartPhone de marca: "+marca+", hacia "+lugar+" (marcador AR: "+marcadorAR+")";
    }
    public String llamar(String numero){
        return "Se ha llamado al numero: "+numero+"con Telefono fijo de marca: "+marca+" (marcador AR: "+marcadorAR+")";
    }
}
