import java.util.InputMismatchException;
import java.util.Scanner;

public class Vista {
    /**
    @author: José Pablo Kiesling Lange
    Nombre del programa: Vista.java
    @version: 
        - Creación: 29/10/2021
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
        System.out.println("\nQueOndaMano, bienvendio a la red social que hace post por mensajitos.");
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
            System.out.println("\n\nMano, ¿que opcion va a querer realizar?");
            System.out.println("\n\n1. Publicar Post");
            System.out.println("2. Ver los post");
            System.out.println("3. Salir\n\n");

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
     * despedida: imprime un mensaje de despedida
     */
    public void despedida(){
        System.out.println("\nOraleMano, espero vuelva pronto a realizar posts por mensajitos");
    }
    //****************************************************************

     /*****************************************************************
     * pedirUsuario: pide el Usuario que hará el post
     * @return usuario
     * @throws Exception
     */
    public String pedirUsuario() throws Exception{
        String usuario = "";
        
        try{
            System.out.println("Mano, ingrese su usuario");
            usuario = scan.nextLine();
            usuario = usuario.substring(0,1).toUpperCase() + usuario.substring(1).toLowerCase();
            System.out.println(); 
        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextLine() " +  usuario + ": " + e.toString();
            throw new Exception(s);
        }
        return usuario;
    }
    //****************************************************************

    /*****************************************************************
     * pedirPost: pide el número de post al que quiere reaccionar
     * @return post
     * @throws Exception
     * @throws InputMismatchException
     */
    public int pedirPost() throws Exception, InputMismatchException{
        int post = 0;
        boolean bandera = false;

        try{
            System.out.println("Mano, ingrese el numero de post mostrado en pantalla al que quiere reaccionar");
        
            while (!bandera){ //Ciclo para evaluar si se ingresó un número de post correcto
                post = Integer.parseInt(scan.nextLine());
                System.out.println();
                if (post >= 0) //Verificar si el número es válido
                    bandera = true;
                else 
                    System.out.println("ERROR: Ingrese un numero de post valido"); 
            }
            
        } catch (InputMismatchException e){ //Error de ingreso por input
            String s = "Error de conversión con scan.nextInt() " + post + ": " + e.toString(); 
            throw new InputMismatchException(s);

        } catch (Exception e){ //Captura cualquier error que no sea de input
            String s = "Ocurrió un error con scan.nextInt() " +  post + ": " + e.toString();
            throw new Exception(s);
        }
        return post;
    }
    //****************************************************************
}
