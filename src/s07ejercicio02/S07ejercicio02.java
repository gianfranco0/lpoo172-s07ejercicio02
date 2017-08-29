/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio02;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creando objeto Scanner
        Scanner input = new Scanner(System.in);
        
        //Creando valor constante
        final double METROS_POR_PIE = 0.305;
        
        //Mostrar mensaje al usuario
        System.out.print("INGRESE UN VALOR EN PIES:   ");
        double feet = input.nextDouble();
        
      //Convertir pies en metros
        double meters = feet * METROS_POR_PIE;
        
        //Mostrando resultado
        System.out.println(feet+"pies son"+ meters + "en metros.");
        
        
    }
}
