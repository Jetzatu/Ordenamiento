
import java.util.Arrays;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class seleccion {
    public static void metodo3() {
        int[] numeros = {9, 5, 7, 3, 1, 8, 6, 2, 4};
        System.out.println("Array sin ordenar: " + Arrays.toString(numeros));

        for (int i = 0; i < numeros.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int temp = numeros[indiceMinimo];
            numeros[indiceMinimo] = numeros[i];
            numeros[i] = temp;
        }
        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}

