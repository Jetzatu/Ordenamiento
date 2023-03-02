
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class mergesort {

    public static void morir() {
        double[] arreglo = {5.1, 2.4, 7.8, 1.9, 9.2, 3.7};
        System.out.println("Arreglo sin ordenar: " + Arrays.toString(arreglo));
        mergesort(arreglo, 0, arreglo.length - 1);
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
    }

    public static double[] mergesort(double[] arreglo, int izq, int der) {
        if (izq < der) {
            int medio = (izq + der) / 2;
            mergesort(arreglo, izq, medio);
            mergesort(arreglo, medio + 1, der);
            mezclar(arreglo, izq, medio, der);
        }
        return arreglo;
    }

    public static int mezclar(double[] arreglo, int izq, int medio, int der) {
        double[] temp = new double[der - izq + 1];
        int i = izq;
        int j = medio + 1;
        int k = 0;

        while (i <= medio && j <= der) {
            if (arreglo[i] <= arreglo[j]) {
                temp[k] = arreglo[i];
                i++;
            } else {
                temp[k] = arreglo[j];
                j++;
            }
            k++;
        }

        while (i <= medio) {
            temp[k] = arreglo[i];
            i++;
            k++;
        }

        while (j <= der) {
            temp[k] = arreglo[j];
            j++;
            k++;
        }

        for (int x = 0; x < temp.length; x++) {
            arreglo[izq + x] = temp[x];
        }
        return 0;
    }
}

