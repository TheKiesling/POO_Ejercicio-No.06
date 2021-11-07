public class Camara_fotografica implements Producto, Movible, Camara, Reproductor{
    int precio=0;
    String serie="";
    String marca="";
    String fechaFabricacion="";
    String marcadorAR="";
    String tipo="";
    public Camara_fotografica (String marca,String serie,String fechaFabricacion,int precio,String marcadorAR){
        this.marca = marca;
        this.serie = serie;
        this.precio=precio;
        this.fechaFabricacion=fechaFabricacion;
        this.marcadorAR=marcadorAR;
        tipo="Camara Fotografica";

    }
    public String[] funciones(){
        String[] funciones={"Mover", "Fotografiar", "Reproducir"};
        return funciones;
    }
    public String probar(int accion, String cosa){
        String act_string="";
        if(accion==1){
            act_string= mover(cosa);
        }else if(accion==2){
            act_string= fotografiar(cosa);
        }else if(accion==3){
            act_string= reproducir(cosa);
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
