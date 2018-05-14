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
public class Facturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String articulo;
        int cantidad;
        double precio;
        double suma = 0;
        String cliente;
        String apellido;
        String cadenaFinal = String.format("%s\t%s\t%s\t%s\n", "Artículo", "Cantidad", "Precio Unitario", "Precio Total");
        boolean conf = true;
        System.out.println("Nombre del supermercado: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el nombre del cliente: ");
        cliente = entrada.nextLine();
        System.out.println("Ingrese el apellido del cliente: ");
        apellido = entrada.nextLine();
        while (conf) {
            /*Si se ingresa celular, se debe ingresar 4 espacios debido al tab*/
            System.out.println("Ingrese el nombre del artículo a comprar(Si se escribe celular, agregar 4 espacios despues de la palabra)");
            articulo = entrada.nextLine();
            System.out.println("Ingrese la cantidad a comprar");
            cantidad = entrada.nextInt();
            System.out.println("Ingrese el precio Unitario");
            precio = entrada.nextDouble();

            double preciototal = precio * cantidad;
            suma = suma + preciototal;
            cadenaFinal = String.format("%s%s\t%d\t\t%.1f\t\t%.1f\n", cadenaFinal, articulo, cantidad, precio, preciototal);
            entrada.nextLine();
            System.out.println("¿Desea ingresar un nuevo producto? (no para salir)");
            String conf2 = entrada.nextLine();
            if ("no".equals(conf2)) {
                conf = false;
            }

        }        
        double iva = suma * 0.14;
        double totalReal = suma + iva;
        System.out.println(" ");
        System.out.println("                      Factura");
        System.out.printf("Supermercado: ''%s''\n",nombre);
        System.out.printf("Nombre del Cliente: %s %s\n",cliente,apellido);
        System.out.println(" ");
        System.out.println(cadenaFinal);
        System.out.printf("\t\t\t\tSubtotal \t%.1f\n",suma);
        System.out.printf("\t\t\t\tIVA 0.14 \t%.2f\n",iva);
        System.out.printf("\t\t\t\tTotal \t\t%.2f\n",totalReal);
        
    }

}
