/**
    @author: José Pablo Kiesling Lange & Andrés Estuardo Montoya Wilhelm
    Nombre del programa: Smart_tv.java
    @version: 
        - Creación: 05/11/2021
        - Última modificación: 07/11/2021

    Clase que tiene como fin proporcionar las funciones y propiedades de una smart tv
    */
public class Smart_tv implements Producto, Navegador, Reproductor {
    int precio=0;
    String serie="";
    String marca="";
    String fechaFabricacion="";
    String marcadorAR="";
    String tipo="";
    public Smart_tv (String marca,String serie,String fechaFabricacion,int precio,String marcadorAR){
        this.marca = marca;
        this.serie = serie;
        this.precio=precio;
        this.fechaFabricacion=fechaFabricacion;
        this.marcadorAR=marcadorAR;
        tipo="Smart TV";
    }
    public String[] funciones(){
        String[] funciones={"1. Reproducir", "2. Navegar"};
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
    public String getFecha(){
        return fechaFabricacion;
    }
    public String getTipo(){
        return tipo;
    }
    public String getSerie(){
        return serie;
    }
    public String getMarcadorAR(){
        return marcadorAR;
    }
    public String reproducir(String video){
        return "Se ha reproducido el video: "+video+" con SmartTV de marca"+marca+" (marcador AR: "+marcadorAR+")";
    }
    public String navegar(String url){
        return "Se ha iniciado el navegador en la pagina: "+url+"Con SmartTV de marca: "+marca+ " (marcador AR: "+marcadorAR+")";
    }
    public String toString(){
        return "Producto: "+tipo+" ,Fecha Fabricacion: "+fechaFabricacion+" ,Marca:"+marca+" ,Precio:"+precio+"\n"; 
    }
}
