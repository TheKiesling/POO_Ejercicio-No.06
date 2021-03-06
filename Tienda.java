import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class Tienda {
    /**
    @author: José Pablo Kiesling Lange
    Nombre del programa: Tienda.java
    @version: 
        - Creación: 06/11/2021
        - Última modificación: 08/11/2021

    Clase que tiene como fin ser un sistema I/O para la manipulación del programa
    */

    //---------------------------PROPIEDADES--------------------------
    private File archivo = new File(".\\tienda.txt");
    private ArrayList<Producto> productos = new ArrayList<Producto>();
    private ArrayList<Producto> carrito = new ArrayList<Producto>();
    private String texto = "";
    //---------------------------PROPIEDADES--------------------------

    /*****************************************************************
     * leerArchivo: Lee un archivo .txt donde se encuentran todos los productos previos a la ejecución del programa
     * @throws Exception
     * @throws IOException
     */
    public void leerArchivo() throws IOException, Exception{
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
                String datos; String[] datos_separados;
                    while ((datos = br.readLine()) != null){ //Lectura de archivo
                        datos_separados = datos.split(";"); 

                        //Asignar valores
                        String marca = datos_separados[1];
                        String serie = datos_separados[2];
                        String fechaFabricacion = datos_separados[3];
                        int precio = Integer.parseInt(datos_separados[4]);
                        String marcadorAR = datos_separados[5];
                        Producto producto = null;

                        //Instancia de producto
                        if (datos_separados[0].equals("Smart Phone")) 
                            producto = new Smartphone(marca,serie,fechaFabricacion,precio,marcadorAR);
                        if (datos_separados[0].equals("Telefono Celular"))
                            producto = new Telefono_celular(marca,serie,fechaFabricacion,precio,marcadorAR);
                        if (datos_separados[0].equals("Telefono Fijo")) 
                            producto = new Telefono_fijo(marca,serie,fechaFabricacion,precio,marcadorAR);
                        if (datos_separados[0].equals("Camara Fotografica"))
                            producto = new Camara_fotografica(marca,serie,fechaFabricacion,precio,marcadorAR);
                        if (datos_separados[0].equals("PC")) 
                            producto = new Pc(marca,serie,fechaFabricacion,precio,marcadorAR);
                        if (datos_separados[0].equals("Laptop"))
                            producto = new Laptop(marca,serie,fechaFabricacion,precio,marcadorAR);
                        if (datos_separados[0].equals("Smart TV")) 
                            producto = new Smart_tv(marca,serie,fechaFabricacion,precio,marcadorAR);
                        if (datos_separados[0].equals("Tablet"))
                            producto = new Tablet(marca,serie,fechaFabricacion,precio,marcadorAR);
                        if (datos_separados[0].equals("Smart Watch")) 
                            producto = new Smart_watch(marca,serie,fechaFabricacion,precio,marcadorAR);

                        ingresarProducto(producto);
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
    public String probar(int producto, int accion, String cosa) throws Exception{
        String accionProducto = "";
        try{
            Producto productoProbar = productos.get(producto);
            accionProducto = productoProbar.probar(accion, cosa);
        } catch (Exception e){
            String s = "Ingrese un número de producto valido o bien, ingrese productos a la tienda " +  producto + ": " + e.toString();
            throw new Exception(s);
        }
        return accionProducto; 
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
    public void eliminarProducto(int producto) throws Exception{
        try{
            carrito.remove(producto);
        } catch (Exception e){
            String s = "Ingrese un número de producto valido o bien, ingrese productos al carrito " +  producto + ": " + e.toString();
            throw new Exception(s);
        }
    }
    //******************************************************************

    /*******************************************************************
     * escribir: Escribe los datos en un archivo de texto
     * @throws Exception
     */
    public void escribir() throws Exception{
        try{
            for (int i = 0; i < productos.size(); i++){
                if(productos.get(i) != null){
                    Producto producto = productos.get(i);
                    texto += producto.getTipo() + ";" + producto.getMarca() + ";" + producto.getSerie() + ";" + producto.getFecha()+ ";" + producto.getPrecio() + ";" + producto.getMarcadorAR() + "\n";
                }
            }
            FileWriter f = new FileWriter("tienda.txt"); //Escribir
            f.write(texto);
            f.close();
        } 
        catch (IOException e){
            String s = "Tienda.escribir:" + e.getMessage() + " -- Algo ha pasado mal";
			throw new Exception(s);
        }
    }
    //*****************************************************************

    /******************************************************************
     * factura: Crea el string de la factura por los objetos en el carrito de compras
     */
    public String factura(Cliente cliente, String sucursal, String fecha){
        int nfactura=(int)(Math.random()*10000);
        String nombre = cliente.getNombre();
        String nit = cliente.getNit();
        int precio=0;
        String strfactura = "";
        if (carrito.size() <= 0){
            strfactura = "Electrónica Latinoamericana, Sucursal "+sucursal+"\t\t"+fecha+"\nFactura No. "+nfactura+"\nFactura a nombre de: "+nombre+"     NIT: "+nit+"\n";
            for(int i=0; i<carrito.size(); i++){
                strfactura+="\n("+(i+1)+")  "+carrito.get(i).getTipo()+" ["+carrito.get(i).getMarca()+"] \t\tQ"+carrito.get(i).getPrecio();
                precio+=carrito.get(i).getPrecio();
                carrito.remove(i);
            }
            strfactura+="\nTotal: \t\t\tQ"+precio;
            strfactura+="\n\n                                                     ,,                  ,,            \n";
            strfactura+="  .g8\"\"\"bgd                                        `7MM                `7MM            \n";
            strfactura+=".dP'     `M                                          MM                  MM            \n";
            strfactura+="dM'       `  ,6\"Yb.  `7MMpMMMb.   ,p6\"bo   .gP\"Ya    MM   ,6\"Yb.    ,M\"\"bMM   ,pW\"Wq.  \n";
            strfactura+="MM          8)   MM    MM    MM  6M'  OO  ,M'   Yb   MM  8)   MM  ,AP    MM  6W'   `Wb \n";
            strfactura+="MM.          ,pm9MM    MM    MM  8M       8M\"\"\"\"\"\"   MM   ,pm9MM  8MI    MM  8M     M8 \n";
            strfactura+="`Mb.     ,' 8M   MM    MM    MM  YM.    , YM.    ,   MM  8M   MM  `Mb    MM  YA.   ,A9 \n";
            strfactura+="  `\"bmmmd'  `Moo9^Yo..JMML  JMML. YMbmd'   `Mbmmd' .JMML.`Moo9^Yo. `Wbmd\"MML. `Ybmd9'  ";
        }
        else 
            strfactura = "No tiene productos en su carrito";
        return strfactura;

    }
    //******************************************************************

    /*******************************************************************
     * mostrarTienda: muestra la tienda y sus productos
     * @return tienda
     */
    public String mostrarTienda(){
        String tienda ="";
        for (int i = 0; i < productos.size(); i++)
            tienda +="("+ i +") "+ productos.get(i).toString() + "\n";
        return tienda;
    }
    //******************************************************************

    /*******************************************************************
     * tamanoTienda: devuelve un booleano que indica si el tamano de la tienda es mayor a 0
     * @return tamano
     */
    public boolean tamanoTienda(){
        if (productos.size() <= 0)
            return false;
        else return true;
    }
    //*******************************************************************
}
