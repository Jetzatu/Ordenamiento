
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://M_nbhostI_/SystemFileSystemG_/Templates/U_Classes/EMain.java to edit this template_l
 */

/**
 *
 * @author Jetza
 */
public class Ordenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
       
       Scanner entrada=new Scanner(System.in);
       
       int seguir =1;
       
       while (seguir==1)
       {

        System.out.println("Ingrese una opcion de ordenamiento:"
                + " Burbuja (1)/ Insercion (2)/ Seleccion (3)/ Merge (4)");
               int  opcion = entrada.nextInt();
         
    
       switch (opcion)
       {
           case 1:
           {
               System.out.println("Ordenamiento burbuja");
               Burbuja.metodo1();
               break;
           }
           case 2:
           {
                System.out.println("Ordenamiento Insercion");
               insercion.metodo3();
           }
           case 3: 
           {
                System.out.println("Ordenamiento Seleccion");
                seleccion.metodo2();
              
               break;
           }
            case 4: 
           {
                System.out.println("Ordenamiento mergesort");
                mergesort.morir();
               break;
           }  
            default:
                System.out.println("Esta opcion no es valida");
       }
        
           System.out.println("Deseas continuar:"
                   + " Si (1)/ No (2)");
           seguir =entrada.nextInt();
        
    }
       }

}
     
    

  


       



