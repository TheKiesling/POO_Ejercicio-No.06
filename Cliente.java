/**
    @author: José Pablo Kiesling Lange & Andrés Estuardo Montoya Wilhelm
    Nombre del programa: Cliente.java
    @version: 
        - Creación: 05/11/2021
        - Última modificación: 07/11/2021

    Clase que tiene como fin proporcionar datos de un cliente
    */
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
