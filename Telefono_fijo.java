public class Telefono_fijo implements Producto, Telefono{
    int precio=0;
    String serie="";
    String marca="";
    String fechaFabricacion="";
    String marcadorAR="";
    String tipo="";
    public Telefono_fijo (String marca,String serie,String fechaFabricacion,int precio,String marcadorAR){
        this.marca = marca;
        this.serie = serie;
        this.precio=precio;
        this.fechaFabricacion=fechaFabricacion;
        this.marcadorAR=marcadorAR;
        tipo="Telefono Fijo";
    }
    public String[] funciones(){
        String[] funciones={"1. Llamar"};
        return funciones;
    }
    public String probar(int accion, String cosa){
        String act_string="";
        if(accion==1){
            act_string= llamar(cosa);
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
    public String llamar(String numero){
        return "Se ha llamado al numero: "+numero+"con Telefono fijo de marca: "+marca+" (marcador AR: "+marcadorAR+")";
    }
    public String toString(){
        return "Producto: "+tipo+" ,Fecha Fabricacion: "+fechaFabricacion+" ,Marca:"+marca+" ,Precio:"+precio+"\n"; 
    }
}
