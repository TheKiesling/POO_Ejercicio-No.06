public class Tablet implements Producto, Movible, Camara, Navegador, Reproductor{
    int precio=0;
    String serie="";
    String marca="";
    String fechaFabricacion="";
    String marcadorAR="";
    String tipo="";
    public Tablet (String marca,String serie,String fechaFabricacion,int precio,String marcadorAR){
        this.marca = marca;
        this.serie = serie;
        this.precio=precio;
        this.fechaFabricacion=fechaFabricacion;
        this.marcadorAR=marcadorAR;
        tipo="Tablet";
    }
    public String[] funciones(){
        String[] funciones={"1. Mover", "2. Fotografiar", "3. Reproducir", "4. Navegar"};
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
    public String mover(String lugar){
        return "Se ha movido la Tablet, de marca: "+marca+", hacia "+lugar+" (marcador AR: "+marcadorAR+")";
    }
    public String fotografiar(String objeto){
        return "Se ha fotografiado un@: "+objeto+" con Tablet de marca"+marca+" (marcador AR: "+marcadorAR+")";
    }
    public String reproducir(String video){
        return "Se ha reproducido el video: "+video+" con Tablet de marca"+marca+" (marcador AR: "+marcadorAR+")";
    }
    public String navegar(String url){
        return "Se ha iniciado el navegador en la pagina: "+url+"Con Tablet de marca: "+marca+ " (marcador AR: "+marcadorAR+")";
    }
    public String toString(){
        return "Producto: "+tipo+" ,Fecha Fabricacion: "+fechaFabricacion+" ,Marca:"+marca+" ,Precio:"+precio+"\n"; 
    }
}
