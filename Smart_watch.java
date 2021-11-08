/**
    @author: José Pablo Kiesling Lange & Andrés Estuardo Montoya Wilhelm
    Nombre del programa: Smart_watch.java
    @version: 
        - Creación: 05/11/2021
        - Última modificación: 07/11/2021

    Clase que tiene como fin proporcionar los metodos y funciones de un smart watch
    */
public class Smart_watch implements Producto, Movible, Camara, Telefono{
    int precio=0;
    String serie="";
    String marca="";
    String fechaFabricacion="";
    String marcadorAR="";
    String tipo="";
    public Smart_watch (String marca,String serie,String fechaFabricacion,int precio,String marcadorAR){
        this.marca = marca;
        this.serie = serie;
        this.precio=precio;
        this.fechaFabricacion=fechaFabricacion;
        this.marcadorAR=marcadorAR;
        tipo="Smart Watch";
    }
    public String[] funciones(){
        String[] funciones={"1. Mover", "2. Llamar", "3. Fotografiar"};
        return funciones;
    }
    public String probar(int accion, String cosa){
        String act_string="";
        if(accion==1){
            act_string= mover(cosa);
        }else if(accion==2){
            act_string= llamar(cosa);
        }else if(accion==3){
            act_string= fotografiar(cosa);
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
    public String mover(String lugar){
        return "Se ha movido el SmartWatch, de marca: "+marca+", hacia "+lugar+" (marcador AR: "+marcadorAR+")";
    }
    public String llamar(String numero){
        return "Se ha llamado al numero: "+numero+"con SmartWatch de marca: "+marca+" (marcador AR: "+marcadorAR+")";
    }
    public String fotografiar(String objeto){
        return "Se ha fotografiado un@: "+objeto+" con SmartWatch de marca"+marca+" (marcador AR: "+marcadorAR+")";
    }
    public String toString(){
        return "Producto: "+tipo+" ,Fecha Fabricacion: "+fechaFabricacion+" ,Marca:"+marca+" ,Precio:"+precio+"\n"; 
    }
}
