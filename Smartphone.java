public class Smartphone implements Producto, Movible, Telefono, Reproductor, Navegador, Camara{
    public String[] funciones(){
        
    }
    public String probar(){

    }
    public int getPrecio(){

    }
    public String getMarca(){
        
    }
    public String mover(String lugar){
        return "Se ha movido el SmartPhone, de marca: "+marca+", hacia "+lugar+" (marcador AR: "+marcadorAR+")";
    }
    public String llamar(String numero){
        return "Se ha llamado al numero: "+numero+"con SmartPhone de marca: "+marca+" (marcador AR: "+marcadorAR+")";
    }
    public String fotografiar(String objeto){
        return "Se ha fotografiado un@: "+objeto+" con SmartPhone de marca"+marca+" (marcador AR: "+marcadorAR+")";
    }
    public String reproducir(String video){
        return "Se ha reproducido el video: "+video+" con SmartPhone de marca"+marca+" (marcador AR: "+marcadorAR+")";
    }
    public String navegar(String url){
        return "Se ha iniciado el navegador en la pagina: "+url+"Con SmartPhone de marca: "+marca+ " (marcador AR: "+marcadorAR+")";
    }
}
