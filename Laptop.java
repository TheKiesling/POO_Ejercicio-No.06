public class Laptop implements Producto, Movible, Reproductor, Navegador, Consola{
    public String[] funciones(){

    }
    public String probar(){

    }
    public int getPrecio(){

    }
    public String getMarca(){

    }
    public String reproducir(String video){
        return "Se ha reproducido el video: "+video+" con Laptop de marca"+marca+" (marcador AR: "+marcadorAR+")";
    }
    public String mover(String lugar){
        return "Se ha movido la Laptop, de marca: "+marca+", hacia "+lugar+" (marcador AR: "+marcadorAR+")";
    }
    public String jugar(String juego){
        return "Se ha iniciado el juego: "+juego+"con Laptop de marca: "+marca+" (marcador AR: "+marcadorAR+")";
    }
    public String navegar(String url){
        return "Se ha iniciado el navegador en la pagina: "+url+"Con Laptop de marca: "+marca+ " (marcador AR: "+marcadorAR+")";
    }
}
