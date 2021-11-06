public class Tablet implements Producto, Movible, Camara, Navegador, Reproductor{
    public String[] funciones(){
        
    }
    public String probar(){

    }
    public int getPrecio(){

    }
    public String getMarca(){
        
    }
    public String mover(String lugar){
        return "Se ha movido la Tablet, de marca: "+marca+", hacia "+lugar+" (marcador AR: "+marcadorAR+")";
    }
    public String fotografiar(String objeto){
        return "Se ha fotografiado un@: "+objeto+" con Tablet de marca"+marca+" (marcador AR: "+marcadorAR+")";
    }
    public String reproducir(String video){
        return "Se ha reproducido el video: "+video+" con Tablet de marca"+marca+" (marcador AR: "+marcadorAR+")";
    }
    public String navegar(String url){
        return "Se ha iniciado el navegador en la pagina: "+url+"Con Tablet de marca: "+marca+ " (marcador AR: "+marcadorAR+")";
    }
}
