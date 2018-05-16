/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso.ciclowhile;

import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class ImportaciondeAutos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limit;
        String marca;
        String origen;
        double costo;
        double impuesto;
        double precioVenta;
        int totalAutos = 0;
        double totalImpuestos = 0;
        double totalPV = 0;
        int countARG = 0;
        int countChl = 0;
        int countCol = 0;
        int countPs = 0;
        int contador = 1;
        String cadenaFinal = String.format("%s\t\t%s\t\t%s\t\t%s\t%s\n", "Marca", "Origen", "Costo", "Impuesto", "Precio venta");
        System.out.println("Ingrese el número de autos a importar");
        limit = entrada.nextInt();
        entrada.nextLine();
        while (contador <= limit) {
            /*Misma situación con el anterior, solo que en este código se especifica en el ingreso por teclado*/
            System.out.println("Ingrese la marca del automovil " + contador );
            marca = entrada.nextLine();
            System.out.println("ingrese el origen");
            origen = entrada.nextLine();
            System.out.println("Ingrese el costo del vehículo");
            costo = entrada.nextDouble();
            switch (origen) {
                case "Argentina":
                    impuesto = costo * 0.2;
                    countARG = countARG + 1;
                    break;
                case "Colombia":
                    impuesto = costo * 0.25;
                    countCol = countCol + 1;
                    break;
                case "Chile":
                    impuesto = costo * 0.3;
                    countChl = countChl + 1;
                    break;
                default:
                    impuesto = costo * 0.4;
                    countPs = countPs + 1;
                    break;
            }
            contador = contador + 1;
            precioVenta = costo + impuesto;
            totalAutos = totalAutos + 1;
            totalImpuestos = totalImpuestos + impuesto;
            totalPV = totalPV + precioVenta;
            cadenaFinal = String.format("%s%-10s\t%-9s\t%.0f\t\t%.0f\t\t%.0f\n", cadenaFinal, marca, origen, costo, impuesto, precioVenta);
            entrada.nextLine();
        }
        System.out.println(" ");
        System.out.println("Reporte de Autos Importados");
        System.out.println(cadenaFinal);
        System.out.printf("Total Autos: %d\tTotal Imp.: %.0f\tTotal PV: %.0f\n", totalAutos, totalImpuestos, totalPV);
        System.out.println(" ");
        System.out.println("Argentina:          " + countARG);
        System.out.println("Chile:              " + countChl);
        System.out.println("Colombia:           " + countCol);
        System.out.println("Resto de Paises:    " + countPs);
    }
}
