/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String hijo;
        int numHijos;
        double pasajes = 0;
        double bar = 0;
        double salidas;
        double totalPasajes = 0;
        double totalBar = 0;
        double totalSalidas = 0;
        double totalTotal = 0;
        double sueldoPapa;
        String cadenaFinal = String.format("%-10s\t%-10s\t%s\t%s\n", "Persona", "Pasajes", "Bar", "Salidas");
        System.out.println("¿Cuánto gana semanalmente en USD el papá? ");
        sueldoPapa = entrada.nextDouble();
        System.out.println("¿Cuántos hijos tiene?");
        numHijos = entrada.nextInt();
        for (int i = 1; i <= numHijos; i++) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre de su hijo " + i + ": ");
            hijo = entrada.nextLine();
            System.out.println("Ingrese el valor que le da a su hijo para pasajes: ");
            pasajes = entrada.nextDouble();
            System.out.println("Ingrese el valor que le da a su hijo para consumo en bares de comida: ");
            bar = entrada.nextDouble();
            System.out.println("Ingrese el valor que le da a su hijo para salidas: ");
            salidas = entrada.nextDouble();
            cadenaFinal = String.format("%s%-10s\t%-10.1f\t%.1f\t%.1f\n", cadenaFinal, hijo, pasajes, bar, salidas);
            totalPasajes = totalPasajes + pasajes;
            totalBar = totalBar + bar;
            totalSalidas = totalSalidas + salidas;
        }
        totalTotal = totalTotal+totalBar+totalPasajes+totalSalidas;
        System.out.println("");
        System.out.println("Gastos Familia");
        System.out.println(cadenaFinal);
        System.out.printf("Totales\t\t%.1f\t\t%.1f\t%.1f\n", totalPasajes, totalBar, totalSalidas);
        System.out.println(" ");
        if (sueldoPapa > totalTotal) {
            System.out.println("Al papá le sobra dinero");
        } else if (sueldoPapa < totalTotal) {
            System.out.println("Al papá le falta dinero");
        } else if (sueldoPapa == totalTotal) {
            System.out.println("El papá tiene el dinero exacto para la semana");
        }
    }

}
