public class Smart_watch implements Producto, Movible, Camara, Telefono{
    public String[] funciones(){
        
    }
    public String probar(){

    }
    public int getPrecio(){

    }
    public String getMarca(){
        
    }
    public String mover(String lugar){
        return "Se ha movido el SmartWatch, de marca: "+marca+", hacia "+lugar+" (marcador AR: "+marcadorAR+")";
    }
    public String llamar(String numero){
        return "Se ha llamado al numero: "+numero+"con SmartWatch de marca: "+marca+" (marcador AR: "+marcadorAR+")";
    }
    public String fotografiar(String objeto){
        return "Se ha fotografiado un@: "+objeto+" con SmartWatch de marca"+marca+" (marcador AR: "+marcadorAR+")";
    }
}
