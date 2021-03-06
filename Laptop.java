/**
    @author: José Pablo Kiesling Lange & Andrés Estuardo Montoya Wilhelm
    Nombre del programa: Laptop.java
    @version: 
        - Creación: 05/11/2021
        - Última modificación: 07/11/2021

    Clase que tiene como fin proporcionar datos y funciones de una laptop
    */
public class Laptop implements Producto, Movible, Reproductor, Navegador, Consola{
    int precio=0;
    String serie="";
    String marca="";
    String fechaFabricacion="";
    String marcadorAR="";
    String tipo="";
    public Laptop (String marca,String serie,String fechaFabricacion,int precio,String marcadorAR){
        this.marca = marca;
        this.serie = serie;
        this.precio=precio;
        this.fechaFabricacion=fechaFabricacion;
        this.marcadorAR=marcadorAR;
        tipo="Laptop";
    }
    public String[] funciones(){
        String[] funciones={"1. Reproducir","2. Mover", "3. Jugar", "4. Navegar"};
        return funciones;
    }
    public String probar(int accion, String cosa){
        String act_string="";
        if(accion==1){
            act_string= reproducir(cosa);
        }else if(accion==2){
            act_string= mover(cosa);
        }else if(accion==3){
            act_string= jugar(cosa);
        }else if(accion==4){
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
    public String toString(){
        return "Producto: "+tipo+" ,Fecha Fabricacion: "+fechaFabricacion+" ,Marca:"+marca+" ,Precio:"+precio+"\n"; 
    }
}
