public class Pc implements Producto, Reproductor, Navegador, Consola{
    public String[] funciones(){
        
    }
    public String probar(){

    }
    public int getPrecio(){

    }
    public String getMarca(){
        
    }
    public String reproducir(String video){
        return "Se ha reproducido el video: "+video+" con PC de marca"+marca+" (marcador AR: "+marcadorAR+")";
    }
    public String jugar(String juego){
        return "Se ha iniciado el juego: "+juego+"con PC de marca: "+marca+" (marcador AR: "+marcadorAR+")";
    }
    public String navegar(String url){
        return "Se ha iniciado el navegador en la pagina: "+url+"Con PC de marca: "+marca+ " (marcador AR: "+marcadorAR+")";
    }
}
