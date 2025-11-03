// TRABAJO DE JÓSE MANUEL RUIZ ZAPATA
// FICHA: 3144585

package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         // --- While --- 
        System.out.println("Ciclos While");
        
        //Ejercicio 1
        System.out.println("Dice los numeros del 1 al 10:");
        int h = 1;
        while (h <= 10) {
            System.out.print(h + " ");
            h++;
        }
        System.out.println();

        //Ejercicio 2
        int n = 1;
        int suma = 0;

        while (n <= 8) {
            suma += n;
            n++;
        }

        System.out.println("Suma de 1 a " + (n-1) + " = " + suma);

        //Ejercicio 3
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número a buscar: ");
        int numeroBuscado = sc.nextInt();

        int[] arreglo = {2, 5, 8, 3, 9, 1, 7, 4};
        int i = 0;
        boolean encontrado = false;

        while (i < arreglo.length) {
            int numeroActual = arreglo[i];
            if (numeroActual == numeroBuscado) {
                encontrado = true;
                break;
            }
            i++;
        }
        if (encontrado) {
            System.out.println("El número " + numeroBuscado + " fue encontrado en la posición " + i);
        } else {
            System.out.println("El número " + numeroBuscado + " no está en el arreglo");
        }     

        // --- Do-while ---
        System.out.println("Ciclos DO-While"); 

        //Ejercicio 1
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste la opción 1.");
                    break;
                case 2:
                    System.out.println("Seleccionaste la opción 2.");
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
            }
        } while (opcion != 3);

        //Ejercicio 2
        int numero;
        int sumaNumeros = 0;
        do {
            System.out.print("Ingrese número: ");
            numero = scanner.nextInt();
            sumaNumeros += numero;
        } while (numero != 0);
        System.out.println("Suma total: " + sumaNumeros);

        //Ejercicio 3
        String contraseñaCorrecta = "Hola1234";
        String contraseñaIngresada;
        do {
            System.out.print("Ingrese contraseña: ");
            contraseñaIngresada = scanner.nextLine();
            
            if (contraseñaIngresada.equals(contraseñaCorrecta)) {
                System.out.println("¡Contraseña correcta! Acceso concedido.");
            } else {
                System.out.println("Contraseña incorrecta. Intente nuevamente.");
            }
        } while (!contraseñaIngresada.equals(contraseñaCorrecta));
        
        // --- For --- 
        System.out.println("Ciclos for");      
        //Ejercicio 1
                for (int j = 2; j <= 20; j += 2) {
            System.out.print(j + " ");
        }
        System.out.println();

        //Ejercicio 2
        System.out.print("Ingresa un número: ");
        int numeroFactorial = scanner.nextInt();
        int factorial = 1;
        
        for (int v = 1; v <= numeroFactorial; v++) {
            factorial *= v;
        }
        
        System.out.println("El factorial de " + numeroFactorial + " es: " + factorial);

        //Ejercicio 3
        int[] numerosArreglo = {10, 7, 6, 9, 2};
        int sumaArreglo = 0;
        for (int l = 0; l < numerosArreglo.length; l++) {
            sumaArreglo += numerosArreglo[l];
        }
        System.out.println("Esta es la suma de los numeros del arreglo: " + sumaArreglo);

        // --- For-each ---       
        System.out.println("Ciclos for each");

        //Ejercicio 1
        int[] enteros = {5, 10, 15, 20, 25};
        int sumaForEach = 0;
        for (int num : enteros) {
            sumaForEach += num;
        }
        System.out.println("El resultado es: " + sumaForEach);

        //Ejercicio 2
        String[] palabras = {"Platanos", "Aguacate", "Tomate", "Papas", "Remolacha"};
        for (String palabra : palabras) {
            System.out.println("- " + palabra);
        }

        //Ejercicio 3
        double[] calificaciones = { 85.5, 90.0, 78.5, 95.5, 88.0 };
        double sumaCalificaciones = 0;

        for (double calificacion : calificaciones) {
            sumaCalificaciones += calificacion;
        }

        double promedio = sumaCalificaciones / calificaciones.length;
        System.out.println("El promedio de calificaciones es: " + promedio);

        // --- Break y Continue ---  
        System.out.println("Break y Continue"); 
        
        //Ejercicio 1
        System.out.println("Se hace break cuando encuentra el numero: ");
        for (int m = 1; m <= 10; m++) {
            if (m == 5) {
                break;
            }
            System.out.print(m + " ");
        } 

        //Ejercicio 2
        for (int p = 0; p < 10; p++) {
            if (p % 2 == 0) {
                continue; 
                }
                System.out.println(p + " ");
        } 
        
        //Ejercicio 3
        for (int c = 1; c < 30; c++) {
            if (c % 3 == 0) {
                continue; 
            }
            if (c > 15) {
                break; 
            }
            System.out.print(c + " ");
        }    
    }
}