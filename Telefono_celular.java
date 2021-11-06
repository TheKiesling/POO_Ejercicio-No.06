public class Telefono_celular implements Producto, Movible, Telefono{
    public String[] funciones(){
        
    }
    public String probar(){

    }
    public int getPrecio(){

    }
    public String getMarca(){
        
    }
    public String mover(String lugar){
        return "Se ha movido el Telefono celular, de marca: "+marca+", hacia "+lugar+" (marcador AR: "+marcadorAR+")";
    }
    public String llamar(String numero){
        return "Se ha llamado al numero: "+numero+"con Telefono celular de marca: "+marca+" (marcador AR: "+marcadorAR+")";
    }
}
