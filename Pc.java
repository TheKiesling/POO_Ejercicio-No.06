public class Pc implements Producto, Reproductor, Navegador, Consola{
    int precio=0;
    String serie="";
    String marca="";
    String fechaFabricacion="";
    String marcadorAR="";
    String tipo="";
    public Pc (String marca,String serie,String fechaFabricacion,int precio,String marcadorAR){
        this.marca = marca;
        this.serie = serie;
        this.precio=precio;
        this.fechaFabricacion=fechaFabricacion;
        this.marcadorAR=marcadorAR;
        tipo="PC";
    }
    public String[] funciones(){
        String[] funciones={"Reproducir", "Jugar", "Navegar"};
        return funciones;
    }
    public String probar(int accion, String cosa){
        String act_string="";
        if(accion==1){
            act_string= reproducir(cosa);
        }else if(accion==2){
            act_string= jugar(cosa);
        }else if(accion==3){
            act_string= navegar(cosa);
        }
        return act_string;
    }
    public int getPrecio(){
        return precio;
    }
    public String getMarca(){
        return marca;
    }
    public String getFecha(){
        return fechaFabricacion;
    }
    public String getTipo(){
        return tipo;
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
