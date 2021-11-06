import java.util.InputMismatchException;
import java.util.Scanner;

public class Vista {
    /**
    @author: José Pablo Kiesling Lange
    Nombre del programa: Vista.java
    @version: 
        - Creación: 5/11/2021
        - Última modificación: 30/10/2021

    Clase que tiene como fin ser un sistema I/O para la manipulación del programa
    */ 

    //---------------------------PROPIEDADES--------------------------
    private Scanner scan;

    //---------------------------MÉTODOS------------------------------

    /*****************************************************************
     * constructor: instancia el scanner
     */
    public Vista(){
        scan = new Scanner(System.in);
    }
    //****************************************************************

    /*****************************************************************
     * error: captura errores y muestra el mensaje que se obtuvo
     * @param e
     */
    public void error(String s){
        System.out.println("Ha ocurrido un error : -- " + s); 
    }
    //****************************************************************

    //---------------------------MENÚ---------------------------------
    /*****************************************************************
     * bienvenida: imprime un mensaje de bienvenida
     */
    public void bienvenida(){
        System.out.println("\nBienvenido a la tienda virtual Electrónica Latinoamericana, la primera en implementar Augmented Reality");
    }
    //****************************************************************

    /*****************************************************************
     * menuOpciones: despliega el menú y recibe la opción del usuario
     * @return opcion
     * @throws Exception 
     * @throws InputMismatchException
     */
    public int menuOpciones() throws Exception, InputMismatchException{
        int opcion = -1;
        boolean bandera = false;

        try{
            //Despliegue de menú de opciones  
            System.out.println("\n\n¿Que opcion desea ejecutar?");
            System.out.println("\n\n1. Leer Archivo");
            System.out.println("2. Ingresar Producto");
            System.out.println("3. Probar Producto");
            System.out.println("4. Agregar Producto al carrito de compras");
            System.out.println("5. Ordenar carrito de compras");
            System.out.println("6. Comprar Producto");
            System.out.println("7. Escribir Archivo");
            System.out.println("8. Salir\n\n");

            while (!bandera){ //Ciclo para evaluar si se ingresó una opcion válida
                opcion = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (opcion > 0 && opcion <= 7) //Opciones válidas
                    bandera = true;
                else{ 
                    System.out.println("ERROR: Ingrese una de las opciones indicadas anteriormente"); 
                }
            }
        } catch (InputMismatchException e){ //Error de ingreso por input
            String s = "Error de conversión con scan.nextInt() " + opcion + ": " + e.toString(); 
            throw new InputMismatchException(s);
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextInt() " +  opcion + ": " + e.toString();
            throw new Exception(s);
        }
        return opcion;
    }
    //****************************************************************

    /*****************************************************************
     * despedida: imprime un mensaje de despedida
     */
    public void despedida(){
        System.out.println("\nAdiós, espero haya pasado muy buena experiencia. Hasta pronto");
    }
    //****************************************************************

     /*****************************************************************
     * pedirNombre: pide el nombre del cliente
     * @return nombre
     * @throws Exception
     */
    public String pedirNombre() throws Exception{
        String nombre = "";
        try{
            System.out.println("Ingrese su nombre");
            nombre = scan.nextLine();
            nombre = nombre.substring(0,1).toUpperCase() + nombre.substring(1).toLowerCase();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  nombre + ": " + e.toString();
            throw new Exception(s);
        }
        return nombre;
    }
    //****************************************************************

    /*****************************************************************
     * pedirNIT: pide el NIT del cliente
     * @return NIT
     * @throws Exception
     */
    public String pedirNIT() throws Exception{
        String NIT = "";
        try{
            System.out.println("Ingrese su NIT");
            NIT = scan.nextLine();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  NIT + ": " + e.toString();
            throw new Exception(s);
        }
        return NIT;
    }
    //****************************************************************

    /*****************************************************************
     * pedirFecha: pide la fecha de hoy
     * @return fecha
     * @throws Exception
     */
    public String pedirFecha() throws Exception{
        String fecha = "";
        try{
            System.out.println("Ingrese la fecha de hoy para su factura (dd/mm/aaaa)");
            fecha = scan.nextLine();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  fecha + ": " + e.toString();
            throw new Exception(s);
        }
        return fecha;
    }
    //****************************************************************

    /*****************************************************************
     * pedirPais: pide el Pais del cliente
     * @return NIT
     * @throws Exception
     */
    public String pedirPais() throws Exception{
        String Pais = "";
        try{
            System.out.println("Ingrese su Pais de residencia");
            Pais = scan.nextLine();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  Pais + ": " + e.toString();
            throw new Exception(s);
        }
        return Pais;
    }
    //****************************************************************

    /*****************************************************************
     * pedirSerie: pide la serie del producto
     * @return serie
     * @throws Exception
     */
    public String pedirSerie() throws Exception{
        String serie = "";
        try{
            System.out.println("Ingrese la serie del producto");
            serie = scan.nextLine();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  serie + ": " + e.toString();
            throw new Exception(s);
        }
        return serie;
    }
    //****************************************************************

    /*****************************************************************
     * pedirMarca: pide la marca del producto
     * @return marca
     * @throws Exception
     */
    public String pedirMarca() throws Exception{
        String marca = "";
        try{
            System.out.println("Ingrese la marca del producto");
            marca = scan.nextLine();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  marca + ": " + e.toString();
            throw new Exception(s);
        }
        return marca;
    }
    //****************************************************************

    /*****************************************************************
     * pedirFechaFabricacion: pide la fecha de fabricación del producto
     * @return fechaFabricacion
     * @throws Exception
     */
    public String pedirFechaFabricacion() throws Exception{
        String fechaFabricacion = "";
        try{
            System.out.println("Ingrese la fecha de fabricacion del producto (dd/mm/aaaa)");
            fechaFabricacion = scan.nextLine();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  fechaFabricacion + ": " + e.toString();
            throw new Exception(s);
        }
        return fechaFabricacion;
    }
    //****************************************************************

    /*****************************************************************
     * pedirPrecio: pide el precio del producto a ingresar
     * @return precio
     * @throws Exception
     * @throws InputMismatchException
     */
    public int pedirPrecio() throws Exception, InputMismatchException{
        int precio = 0;
        boolean bandera = false;

        try{
            System.out.println("Ingrese el precio del producto");
        
            while (!bandera){ //Ciclo para evaluar si se ingresó un número correcto
                precio = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (precio >= 0) //Verificar si el número es válido
                    bandera = true;
                else 
                    System.out.println("ERROR: Ingrese un numero valido"); 
            }
            
        } catch (InputMismatchException e){ //Error de ingreso por input
            String s = "Error de conversión con scan.nextInt() " + precio + ": " + e.toString(); 
            throw new InputMismatchException(s);

        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextInt() " +  precio + ": " + e.toString();
            throw new Exception(s);
        }
        return precio;
    }
    //****************************************************************

    /*****************************************************************
     * pedirMarcadorAR: pide el marcadorAR del producto
     * @return marcadorAR
     * @throws Exception
     */
    public String pedirMarcadorAR() throws Exception{
        String marcadorAR = "";
        try{
            System.out.println("Ingrese el marcadorAR del producto");
            marcadorAR = scan.nextLine();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  marcadorAR + ": " + e.toString();
            throw new Exception(s);
        }
        return marcadorAR;
    }
    //****************************************************************

    /*****************************************************************
     * pedirAccion: despliega el menú de acciones y recibe el numero de accion que desea hacer
     * @return opcion
     * @throws Exception 
     * @throws InputMismatchException
     */
    public int pedirAccion(String[] acciones) throws Exception, InputMismatchException{
        int opcion = -1;
        boolean bandera = false;

        try{
            //Despliegue de menú de opciones 
            System.out.println("Ingrese la acción que desea ejecutar"); 
            System.out.println(acciones);
            
            while (!bandera){ //Ciclo para evaluar si se ingresó una opcion válida
                opcion = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (opcion > 0 && opcion <= acciones.length) //Opciones válidas
                    bandera = true;
                else{ 
                    System.out.println("ERROR: Ingrese una de las opciones indicadas anteriormente"); 
                }
            }
        } catch (InputMismatchException e){ //Error de ingreso por input
            String s = "Error de conversión con scan.nextInt() " + opcion + ": " + e.toString(); 
            throw new InputMismatchException(s);
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextInt() " +  opcion + ": " + e.toString();
            throw new Exception(s);
        }
        return opcion; 
    }
    //****************************************************************

    /*****************************************************************
     * pedirEstandar: despliega el menú de tipos de ordenamiento y recibe la opción que quiere hacer
     * @return opcion
     * @throws Exception 
     * @throws InputMismatchException
     */
    public int pedirEstandar() throws Exception, InputMismatchException{
        int opcion = -1;
        boolean bandera = false;

        try{
            //Despliegue de menú de opciones  
            System.out.println("\n\nBajo que criterio desea ordenar su carrito de compras");
            System.out.println("\n\n1. Precio");
            System.out.println("2. Fecha Fabricacion");
            System.out.println("3. Marca\n\n");

            while (!bandera){ //Ciclo para evaluar si se ingresó una opcion válida
                opcion = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (opcion > 0 && opcion <= 3) //Opciones válidas
                    bandera = true;
                else{ 
                    System.out.println("ERROR: Ingrese una de las opciones indicadas anteriormente"); 
                }
            }
        } catch (InputMismatchException e){ //Error de ingreso por input
            String s = "Error de conversión con scan.nextInt() " + opcion + ": " + e.toString(); 
            throw new InputMismatchException(s);
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextInt() " +  opcion + ": " + e.toString();
            throw new Exception(s);
        }
        return opcion;
    }
    //****************************************************************

    /*****************************************************************
     * pedirProducto: pide el producto que quiere probar
     * @return precio
     * @throws Exception
     * @throws InputMismatchException
     */
    public int pedirProducto() throws Exception, InputMismatchException{
        int producto = 0;
        boolean bandera = false;

        try{
            System.out.println("Ingrese el producto que quiere probar");
        
            while (!bandera){ //Ciclo para evaluar si se ingresó un número correcto
                producto = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (producto >= 0) //Verificar si el número es válido
                    bandera = true;
                else 
                    System.out.println("ERROR: Ingrese un numero valido"); 
            }
            
        } catch (InputMismatchException e){ //Error de ingreso por input
            String s = "Error de conversión con scan.nextInt() " + producto + ": " + e.toString(); 
            throw new InputMismatchException(s);

        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextInt() " +  producto + ": " + e.toString();
            throw new Exception(s);
        }
        return producto;
    }
    //****************************************************************

    /*****************************************************************
     * pedirObjeto: pide un objeto al que quiere fotografiar
     * @return objeto
     * @throws Exception
     */
    public String pedirObjeto() throws Exception{
        String objeto = "";
        try{
            System.out.println("Ingrese el objeto al que quiere fotografiar");
            objeto = scan.nextLine();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  objeto + ": " + e.toString();
            throw new Exception(s);
        }
        return objeto;
    }
    //****************************************************************

    /*****************************************************************
     * pedirNumero: pide un numero de telefono para llamar
     * @return numero
     * @throws Exception
     */
    public String pedirNumero() throws Exception{
        String numero = "";
        try{
            System.out.println("Ingrese un numero telefonico para llamar");
            numero = scan.nextLine();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  numero + ": " + e.toString();
            throw new Exception(s);
        }
        return numero;
    }
    //****************************************************************

    /*****************************************************************
     * pedirVideo: pide un video para reproducir
     * @return video
     * @throws Exception
     */
    public String pedirVideo() throws Exception{
        String video = "";
        try{
            System.out.println("Ingrese un video para reproducir");
            video = scan.nextLine();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  video + ": " + e.toString();
            throw new Exception(s);
        }
        return video;
    }
    //****************************************************************

    /*****************************************************************
     * pedirJuego: pide un juego para jugarlo
     * @return juego
     * @throws Exception
     */
    public String pedirJuego() throws Exception{
        String juego = "";
        try{
            System.out.println("Ingrese un juego para probarlo");
            juego = scan.nextLine();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  juego + ": " + e.toString();
            throw new Exception(s);
        }
        return juego;
    }
    //****************************************************************

    /*****************************************************************
     * pedirLugar: pide un lugar para movilizarse
     * @return lugar
     * @throws Exception
     */
    public String pedirLugar() throws Exception{
        String lugar = "";
        try{
            System.out.println("Ingrese un lugar para movilizarse");
            lugar = scan.nextLine();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  lugar + ": " + e.toString();
            throw new Exception(s);
        }
        return lugar;
    }
    //****************************************************************
}
