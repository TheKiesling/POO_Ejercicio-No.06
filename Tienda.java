import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Tienda {
    /**
    @author: José Pablo Kiesling Lange
    Nombre del programa: Tienda.java
    @version: 
        - Creación: 06/11/2021
        - Última modificación: 30/10/2021

    Clase que tiene como fin ser un sistema I/O para la manipulación del programa
    */

    //---------------------------PROPIEDADES--------------------------
    private File archivo = new File(".\\tienda.txt");
    private ArrayList<Producto> productos = new ArrayList<Producto>();
    private ArrayList<Producto> carrito = new ArrayList<Producto>();
    //---------------------------PROPIEDADES--------------------------

    /*****************************************************************
     * leerArchivo: Lee un archivo .txt donde se encuentran todos los productos previos a la ejecución del programa
     * @throws Exception
     * @throws IOException
     */
    public void leerArchivo() throws IOException, Exception{
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String[] datos = new String[1000000]; String[] datos_separados;
            for(int i = 0; i < 9; i++){
                while ((datos[i] = br.readLine()) != null){ //Lectura de archivo
                    datos_separados = datos[i].split(";"); 
                    for(int j = 0; j < Integer.parseInt(datos_separados[1]); j++){

                        //Asignar valores
                        String marca = datos_separados[2+5*j];
                        String serie = datos_separados[3+5*j];
                        String fechaFabricacion = datos_separados[4+5*j];
                        int precio = Integer.parseInt(datos_separados[5+5*j]);
                        String marcadorAR = datos_separados[6+5*j];
                        Producto producto = null;

                        //Instancia de producto
                        if (i == 0) 
                            producto = new Smartphone(marca,serie,fechaFabricacion,precio,marcadorAR);
                        if (i == 1)
                            producto = new Telefono_celular(marca,serie,fechaFabricacion,precio,marcadorAR);
                        if (i == 2) 
                            producto = new Telefono_fijo(marca,serie,fechaFabricacion,precio,marcadorAR);
                        if (i == 3)
                            producto = new Camara_fotografica(marca,serie,fechaFabricacion,precio,marcadorAR);
                        if (i == 4) 
                            producto = new Pc(marca,serie,fechaFabricacion,precio,marcadorAR);
                        if (i == 5)
                            producto = new Laptop(marca,serie,fechaFabricacion,precio,marcadorAR);
                        if (i == 6) 
                            producto = new Smart_tv(marca,serie,fechaFabricacion,precio,marcadorAR);
                        if (i == 7)
                            producto = new Tablet(marca,serie,fechaFabricacion,precio,marcadorAR);
                        if (i == 8) 
                            producto = new Smart_watch(marca,serie,fechaFabricacion,precio,marcadorAR);

                        ingresarProducto(producto);
                    }
                }
            }
        }
        catch (IOException e){
            String s = "tienda.leerArchivo:" + e.toString() + " Error de lectura";
			throw new Exception(s);
        }
        catch (Exception e){
            String s = "ERROR: tienda.leerArchivo: " + e.toString(); 
            throw new Exception(s);
        }
    }
    //****************************************************************

    /*****************************************************************
     * ingresarProducto: Ingresa un producto al arreglo de productos
     * @param producto
     */
    public void ingresarProducto(Producto producto){
        productos.add(producto);
    }
    //*****************************************************************

    /******************************************************************
     * funciones: devuelve las funciones que tiene el producto que el cliente quiere saber
     * @param producto
     * @return funciones
     */
    public String[] funciones(int producto){
        return productos.get(producto).funciones();
    }
    //*****************************************************************

    /******************************************************************
     * probar: Prueba un producto con determinada acción
     * @param producto
     * @param accion
     * @param cosa
     * @return accion
     */
    public String probar(int producto, int accion, String cosa){
        Producto productoProbar = productos.get(producto);
        return productoProbar.probar(accion, cosa);
    }
    //*****************************************************************

    /******************************************************************
     * agregarCarro: Agrega producto al carro
     * @param producto
     */
    public void agregarCarro(int producto){
        Producto prod = productos.get(producto);
        productos.remove(producto);
        carrito.add(prod);
    }
    //*****************************************************************

    /******************************************************************
     * ordenar: Ordena los productos del carro
     * @param estandar
     * @return carro
     */
    public String ordenar(int estandar){
        String carro="Carrito de compras: \n";
        if(estandar==1){
            Collections.sort(carrito,new SortPrecio());
        }else if (estandar==2){
            Collections.sort(carrito,new SortFecha());
        }else if(estandar==3){
            Collections.sort(carrito,new SortMarca());
        }
        for(int i=0;i<carrito.size();i++){
            carro+=(i+1)+". Producto: "+carrito.get(i).getTipo()+" ,Fecha Fabricacion: "+carrito.get(i).getFecha()+" ,Marca:"+carrito.get(i).getMarca()+" ,Precio:"+carrito.get(i).getPrecio()+"\n";
        }
        return carro;
    }
    //*****************************************************************

    /******************************************************************
     * eliminarProducto: elimina un producto del carrito
     * @param producto
     */
    public void eliminarProducto(int producto){
        carrito.remove(producto);
    }
    //******************************************************************
}
