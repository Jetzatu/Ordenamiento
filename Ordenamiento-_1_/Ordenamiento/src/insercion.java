
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
 public class insercion {
     public static void metodo3 ()
     {
       Scanner entrada=new Scanner(System.in);
       
       int cantidad, rango=100, numero;
       int pos;
       int ayuda;
       
               
         System.out.println("Ingresar el tamaño del arreglo: ");
         cantidad=entrada.nextInt();
         int varios[]=new int[cantidad];//
        for(int i=0;i<varios.length;i++)
          {
              numero=(int)(Math.random()*rango);
              varios[i]=numero;
          }
        
       
        
        //Le asisnamos el numero de elementos al arreglo
          for(int i=0;i<varios.length;i++) 
          {
              System.out.println(varios[i]);
                for(i=1;i<cantidad;i++)
               {
                   
                   for(int j=0;j<1;j++)
                   {
                       if(varios[i]==varios[j])
                       {
                           i--;
                       }
                   }
               }
               
            for (int k=1;k<cantidad;k++)
            {
                System.out.println((k+1)+"-"+varios[k]);
            }
          }
        
        
      for (int i=0; i<varios.length;i++) 
      {
          pos = i;
          ayuda = varios[i];
          
          while((pos>0) && (varios[pos-1] > ayuda)){
              
              varios[pos] = varios[pos-1];
              pos--;
          }
          varios[pos] = ayuda;
      }
      System.out.println("Orden Ascendente: ");
      
      for(int i=0; i<varios.length;i++){
          
          System.out.println(varios[i]);
      }
     }
 }   
    
