/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdowhile;

import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class EjerciciosDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrda = new Scanner(System.in);
        String cadenaRegistro = "";
        double promedioPases;
        double promedioGoles;
        boolean confirmacion = true;
        int numPartidos = 0;
        int numJugadores=0;
        do {
            String nombre;            
            int pasesPartido = 0;
            int golesPartido = 0;
            int totalPases = 0;
            int totalGoles = 0;
            String nivelJugador = "";
            int totalJugadoresPases = 0;
            int totalJugadoresGoles = 0;
            String cadena = "";
            String cadenaPartidosFinal = "";
            cadenaRegistro = "";
            String cadenaEncabezado = String.format("%-18s\t\t\t%-15s\t\t%-11s\t%s\n", "Nombre del Jugador", "Total de Pases", "Total Goles", "Nivel de Jugador");
            System.out.println("Ingrese el número de reportes a ingresar");
            numJugadores = entrda.nextInt();
            System.out.println("Ingrese el número de partidos que serán registrados: ");
            numPartidos = entrda.nextInt();
            entrda.nextLine();
            for (int i = 1; i <= numJugadores; i++) {
                System.out.println("Ingrese el nombre del jugador: ");
                nombre = entrda.nextLine();
                for (int j = 1; j <= numPartidos; j++) {
                    System.out.println("Ingrese el número de pases en el partido " + j);
                    pasesPartido = entrda.nextInt();
                    System.out.println("Ingrese el número de goles en el partido " + j);
                    golesPartido = entrda.nextInt();
                    totalPases = totalPases + pasesPartido;
                    totalGoles = totalGoles + golesPartido;
                    cadenaPartidosFinal = String.format("%s\t\t\t\tP%d: %d\t\t\tP%d: %d\n\t", cadenaPartidosFinal, j, pasesPartido, j, golesPartido);
                    entrda.nextLine();
                }
                totalJugadoresPases = totalJugadoresPases + totalPases;
                totalJugadoresGoles = totalJugadoresGoles + totalGoles;
                if (totalPases >= 100) {
                    nivelJugador = "Excelente";
                } else if (totalPases <= 99 && totalPases >= 80) {
                    nivelJugador = "Muy Bueno";
                } else if (totalPases <= 79 && totalPases >= 60) {
                    nivelJugador = "Bueno";
                } else if (totalPases <= 59) {
                    nivelJugador = "Regular";
                }
                cadena = String.format("%s%s%s\t\n", cadenaEncabezado, nombre, cadenaPartidosFinal);
                String cadenaPartidosResultados = String.format("\t\t\t\t\tTotal: %d\t\tTotal: %d\t%s\n", totalPases, totalGoles, nivelJugador);
                cadenaRegistro = String.format("%s\n%s\n%s", cadenaRegistro, cadena, cadenaPartidosResultados);
                cadenaPartidosFinal = "";
                totalGoles = 0;
                totalPases = 0;
            }
            promedioPases = totalJugadoresPases / numPartidos;
            promedioGoles = totalJugadoresGoles / numPartidos;
            confirmacion = false;
        } while (confirmacion);

        System.out.println("");
        System.out.println("");
        System.out.println("Reporte de Jugadores Equipo UTPL");
        System.out.println(cadenaRegistro);
        System.out.println("\nDatos Finales");
        System.out.println("Jugadores Analizados: "+numJugadores);
        System.out.println("Promedio de Pases del equipo: " + promedioPases);
        System.out.println("Promedio de Goles del equipo: " + promedioGoles);
    }

}
