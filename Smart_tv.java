public class Smart_tv implements Producto, Navegador, Reproductor {
    public String[] funciones(){
        
    }
    public String probar(){

    }
    public int getPrecio(){

    }
    public String getMarca(){
        
    }
    public String reproducir(String video){
        return "Se ha reproducido el video: "+video+" con SmartTV de marca"+marca+" (marcador AR: "+marcadorAR+")";
    }
    public String navegar(String url){
        return "Se ha iniciado el navegador en la pagina: "+url+"Con SmartTV de marca: "+marca+ " (marcador AR: "+marcadorAR+")";
    }
}
