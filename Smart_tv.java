public class Smart_tv implements Producto, Navegador, Reproductor {
    int precio=0;
    String serie="";
    String marca="";
    String fechaFabricacion="";
    String marcadorAR="";
    public Smart_tv (String marca,String serie,String fechaFabricacion,int precio,String marcadorAR){
        this.marca = marca;
        this.serie = serie;
        this.precio=precio;
        this.fechaFabricacion=fechaFabricacion;
        this.marcadorAR=marcadorAR;

    }
    public String[] funciones(){
        String[] funciones={"Reproducir", "Navegar"};
        return funciones;
    }
    public String probar(int accion, String cosa){
        String act_string="";
        if(accion==1){
            act_string= reproducir(cosa);
        }else if(accion==2){
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
    public String reproducir(String video){
        return "Se ha reproducido el video: "+video+" con SmartTV de marca"+marca+" (marcador AR: "+marcadorAR+")";
    }
    public String navegar(String url){
        return "Se ha iniciado el navegador en la pagina: "+url+"Con SmartTV de marca: "+marca+ " (marcador AR: "+marcadorAR+")";
    }
}
