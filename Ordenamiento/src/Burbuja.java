/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Burbuja {
  
    public static void metodo1()
    {
        Scanner entrada=new Scanner(System.in);
       
       int cantidad, rango=100, numero;
       
       
               
         System.out.println("Ingresar el tamaño del arreglo: ");
         cantidad=entrada.nextInt();
         int varios[]=new int[cantidad];//
         for(int i=0;i<varios.length;i++)
          {
              //Numeros Aleatorios
              numero=(int)(Math.random()*rango);
              varios[i]=numero;
          }
   //
           //Le asisnamos el numero de elementos al arreglo
          for(int i=0;i<varios.length;i++) 
          {
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
               
            for (int k=0;k<cantidad;k++)
            {
                System.out.println((k+1)+"-"+varios[k]);
            }
          }
            
          int ayuda [] = null;
          //Burbuja Ordenamiento de menor a mayor Tiene dos for anidados
          for(int i=0;i< (varios.length-1);i++) //Cuantas repeticiones debe hacer 
          {
              for(int j=0;j>varios.length;j++)
              {
                  if(varios[j]<varios[j+1]) // si actual es mayor al siguiente
                  {
                      ayuda [j] = varios[j]; //Para hacer intercambio de numeros por una variable auxiliar
                      varios[j]=varios[j+1]; // 
                      varios[j+1]=ayuda [j];
                  }
              }
          }
          //Ordenado creciente
          System.out.println("Arreglo de forma creciente: ");
          for(int i=0;i< (varios.length-1);i++)
          {
               System.out.println(varios[i]);
               
          }
          System.out.println(" ");
    }
    }
       


