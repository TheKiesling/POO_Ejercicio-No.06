public class Camara_fotografica implements Producto, Movible, Camara, Reproductor{
    public Camara_fotografica(){
        
    }
    public String[] funciones(){
        
    }
    public String probar(){

    }
    public int getPrecio(){

    }
    public String getMarca(){
        
    }
    public String fotografiar(String objeto){
        return "Se ha fotografiado un@: "+objeto+" con Camara fotografica de marca"+marca+" (marcador AR: "+marcadorAR+")";
    }
    public String reproducir(String video){
        return "Se ha reproducido el video: "+video+" con Camara fotografica de marca"+marca+" (marcador AR: "+marcadorAR+")";
    }
    public String mover(String lugar){
        return "Se ha movido la Camara fotografica, de marca: "+marca+", hacia "+lugar+" (marcador AR: "+marcadorAR+")";
    }
}
