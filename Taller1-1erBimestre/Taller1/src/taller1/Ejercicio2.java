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
public class Ejercicio2 {

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
        int numpapas;
        String cadenaFinal2 = "";
        String conclusion = "";
        System.out.println("Ingrese el numero de reporte de familia a ingresar: ");
        numpapas = entrada.nextInt();
        entrada.nextLine();
        String cadenaFinal = String.format("%-10s\t%-10s\t%s\t%s\n", "Persona", "Pasajes", "Bar", "Salidas");
        for (int j = 1; j <= numpapas; j++) {
            /*Inicialización de variables dentro del ciclo*/
            totalTotal = 0;
            totalBar = 0;
            totalPasajes = 0;
            totalSalidas = 0;
            cadenaFinal = String.format("%-10s\t%-10s\t%s\t%s\n", "Persona", "Pasajes", "Bar", "Salidas");
            System.out.println("Ingrese el nombre del papá: ");
            String papa = entrada.nextLine();
            System.out.println("¿Cuánto gana semanalmente en USD el papá? ");
            sueldoPapa = entrada.nextDouble();
            System.out.println("¿Cuántos hijos tiene?");
            numHijos = entrada.nextInt();
            /*Ciclo para ingreso de datos de los hijos*/
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
            totalTotal = totalTotal + totalBar + totalPasajes + totalSalidas;
            /*Uso de una variable String para dar la conclusión del reporte de gastos*/
            if (sueldoPapa > totalTotal) {
                conclusion = "le sobra dinero";
            } else if (sueldoPapa < totalTotal) {
                conclusion = "le falta dinero";
            } else if (sueldoPapa == totalTotal) {
                conclusion = "tiene el dinero exacto para la semana";
            }
            /*Creación de una nueva String.format para generar el reporte definitivo*/
            cadenaFinal2 = String.format("%sNombre del padre de Familia: %s\nSueldo semanal: %.1f\nNúmero de hijos: %d\n%s\nTotales\t\t%.1f\t\t%.1f\t%.1f\nEl padre de familia: %s, %s\n\n", cadenaFinal2, papa, sueldoPapa, numHijos, cadenaFinal, totalPasajes, totalBar, totalSalidas, papa, conclusion);

            entrada.nextLine();
        }
        System.out.println("Reporte de Gastos");
        System.out.println(cadenaFinal2);
    }
}
