public class Telefono_celular implements Producto, Movible, Telefono{
    int precio=0;
    String serie="";
    String marca="";
    String fechaFabricacion="";
    String marcadorAR="";
    String tipo="";
    public Telefono_celular (String marca,String serie,String fechaFabricacion,int precio,String marcadorAR){
        this.marca = marca;
        this.serie = serie;
        this.precio=precio;
        this.fechaFabricacion=fechaFabricacion;
        this.marcadorAR=marcadorAR;
        tipo="Telefono Celular";
    }
    public String[] funciones(){
        String[] funciones={"Mover","Llamar"};
        return funciones;
    }
    public String probar(int accion, String cosa){
        String act_string="";
        if(accion==1){
            act_string= mover(cosa);
        }else if(accion==2){
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
    public String mover(String lugar){
        return "Se ha movido el Telefono celular, de marca: "+marca+", hacia "+lugar+" (marcador AR: "+marcadorAR+")";
    }
    public String llamar(String numero){
        return "Se ha llamado al numero: "+numero+"con Telefono celular de marca: "+marca+" (marcador AR: "+marcadorAR+")";
    }
}
