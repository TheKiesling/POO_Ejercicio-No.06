public class Controlador {
    /** 
    @author: José Pablo Kiesling Lange
    Nombre del programa: Controlador.java
    @version: 
        - Creación: 05/11/2021
        - Última modificación: 05/11/2021

    Clase que comunica el modelo con la vista y controla sus acciones
    */

    //---------------------------MÉTODOS-----------------------------
    public static void main(String[] args) {
        Vista vista = new Vista();
        Tienda tienda = new Tienda();
        Producto producto = null;

        try{
            //Saludar al usuario
            vista.bienvenida();

            int opcion = -1;
            while (opcion != 8){
                //Despliegue de las opciones del menú y su previa lectura de dicha opción
                opcion = vista.menuOpciones();

                if (opcion == 1){ //leer Archivo
                    tienda.leerArchivo();
                }

                if (opcion == 2){//Ingresar Producto
                    int precio = vista.pedirPrecio();
                    String serie = vista.pedirSerie();
                    String marca = vista.pedirMarca();
                    String marcadorAR = vista.pedirMarcadorAR();
                    int opcionProducto = vista.menuOpcionesProducto();
                    if (opcionProducto == 1){
                        producto = new Smartphone();
                    }

                }

                if (opcion == 3){ //Probar producto
                    int productoProbar = vista.pedirProducto();
                    String[] funciones = tienda.funciones(productoProbar);
                    int accion = vista.pedirAccion(funciones);
                    String accion = tienda.probar(productoProbar, accion);
                    vista.accion(accion);
                }

                if (opcion == 4){ //Agregar al carrito
                    int productoAgregar = vista.pedirProducto();
                    tienda.agregarCarro(productoAgregar);
                }

                if (opcion == 5){ //Ordenar el carrito
                    int estandar = vista.pedirEstandar();
                    String ordenar = tienda.ordenar(estandar);
                    vista.mostrar(ordenar);
                }

                if (opcion == 6){ //Comprar 
                    int productoComprar = vista.pedirProducto();
                    String factura = tienda.factura(productoComprar);
                    vista.mostrar(factura);
                }

                if(opcion == 7){ //Escribir
                    tienda.escribir();
                }

                if(opcion == 8) //Salir
                    vista.despedida();
            }


        } catch (Exception e){
            String s = "ERROR: " + e.getMessage();
            vista.error(s);
        }
    }
}
