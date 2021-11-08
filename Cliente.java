public class Cliente {
    String nombre;
    String nit;
    public Cliente(String nombre, String nit){
        this.nombre = nombre;
        this.nit = nit;
    }
    public String getNombre(){
        return nombre;
    }
    public String getNit(){
        return nit;
    }
}
