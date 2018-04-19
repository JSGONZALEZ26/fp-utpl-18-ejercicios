/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class SeleccionAnidada {

    public static void main(String[] args) {
        // documentacion
        Scanner entrada = new Scanner(System.in);
        int calificacion;
        String nombre;       
        String apellido;
        
        
        System.out.println("Ingrese el nombre del estudiante");
        nombre = entrada.nextLine();
       
        System.out.println("Ingrese el apellido del estudiante");
        apellido = entrada.nextLine();
                 
        System.out.println("Ingrese su calificación");
        calificacion = entrada.nextInt();
            
        
        if (calificacion >=50) {
            System.out.printf("Estudiante %s %s\n Aprobado\n con calificación \n%d\n", nombre.toUpperCase(), apellido.toUpperCase(), calificacion);
        } else {
           
                    System.out.printf("Estudiante %s  %s\n Reprobado\n con calificación \n%d\n", nombre.toUpperCase(), apellido.toUpperCase(), calificacion);
                }
    }           
}
