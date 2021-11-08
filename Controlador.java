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
            while (opcion != 9){
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
                    String fechaFabricacion = vista.pedirFechaFabricacion();
                    int opcionProducto = vista.menuOpcionesProducto();
                    if (opcionProducto == 1){
                        producto = new Smartphone(marca,serie,fechaFabricacion,precio,marcadorAR);
                    }
                    if (opcionProducto == 2){
                        producto = new Telefono_celular(marca,serie,fechaFabricacion,precio,marcadorAR);
                    }
                    if (opcionProducto == 3){
                        producto = new Telefono_fijo(marca,serie,fechaFabricacion,precio,marcadorAR);
                    }
                    if (opcionProducto == 4){
                        producto = new Camara_fotografica(marca,serie,fechaFabricacion,precio,marcadorAR);
                    }
                    if (opcionProducto == 5){
                        producto = new Pc(marca,serie,fechaFabricacion,precio,marcadorAR);
                    }
                    if (opcionProducto == 6){
                        producto = new Laptop(marca,serie,fechaFabricacion,precio,marcadorAR);
                    }
                    if (opcionProducto == 7){
                        producto = new Smart_tv(marca,serie,fechaFabricacion,precio,marcadorAR);
                    }
                    if (opcionProducto == 8){
                        producto = new Tablet(marca,serie,fechaFabricacion,precio,marcadorAR);
                    }
                    if (opcionProducto == 9){
                        producto = new Smart_watch(marca,serie,fechaFabricacion,precio,marcadorAR);
                    }
                    tienda.ingresarProducto(producto);
                }

                if (opcion == 3){ //Probar producto
                    if (tienda.tamanoTienda()){
                        String tiendaProductos = tienda.mostrarTienda();
                        vista.mostrar(tiendaProductos);
                        int productoProbar = vista.pedirProducto();
                        String[] funciones = tienda.funciones(productoProbar);
                        int accion = vista.pedirAccion(funciones);
                        String cosa = vista.pedirCosa(accion);
                        String accionProducto = tienda.probar(productoProbar, accion, cosa);
                        vista.mostrar(accionProducto);
                    }
                    else
                        vista.tiendaInvalida();
                }

                if (opcion == 4){ //Agregar al carrito
                    String tiendaProductos = tienda.mostrarTienda();
                    vista.mostrar(tiendaProductos);
                    int productoAgregar = vista.pedirProducto();
                    tienda.agregarCarro(productoAgregar);
                }

                if (opcion == 5){ //Ordenar el carrito
                    int estandar = vista.pedirEstandar();
                    String ordenar = tienda.ordenar(estandar);
                    vista.mostrar(ordenar);
                }

                if (opcion == 6){ //Eliminar del carrito
                    String ordenar = tienda.ordenar(1);
                    vista.mostrar(ordenar);
                    int productoEliminar = vista.pedirProducto();
                    tienda.eliminarProducto(productoEliminar);
                }

                if (opcion == 7){ //Comprar
                    String sucursal= vista.pedirSucursal();
                    String nombre = vista.pedirNombre();
                    String nit = vista.pedirNIT();
                    String fecha= vista.pedirFecha();
                    Cliente cliente = new Cliente(nombre, nit);
                    String factura = tienda.factura(cliente, sucursal, fecha);
                    vista.mostrar(factura);
                }

                if(opcion == 8){ //Escribir
                    tienda.escribir();
                }

                if(opcion == 9) //Salir
                    vista.despedida();
            }


        } catch (Exception e){
            String s = "ERROR: " + e.getMessage();
            vista.error(s);
        }
    }
}
