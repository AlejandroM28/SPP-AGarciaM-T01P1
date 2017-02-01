/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.agarciam.t01p2;
import java.util.Scanner;

/**
 *
 * @author alejandromonroy
 */
public class SPPAGarciaMT01P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double mat,cal1,cal2,cal3,cal4,cal5,pro; 
        
         //mat = matricula, cal = Califiacion, pro = Promedio
        Scanner kb= new Scanner (System.in);
        
        // Pedir datos 
        System.out.println("Introduce tu Matricula");
        mat = kb.nextDouble();
        System.out.println("Introduce 5 calificaciones de tus materias");
        System.out.println("Introduce tu primera calificacion");
        cal1 = kb.nextDouble();
        System.out.println("Introduce tu segunda calificacion");
        cal2 = kb.nextDouble();
        System.out.println("Introduce tu tercera calificacion");
        cal3 = kb.nextDouble();
        System.out.println("Introduce tu cuarta calificacion");
        cal4 = kb.nextDouble();
        System.out.println("Introduce tu quinta calificacion");
        cal5 = kb.nextDouble();
        
        //Resolver Promedio 
        pro = ((cal1 + cal2 + cal3 + cal4 + cal5)/5);
        
        if (pro > 6.9)
            System.out.println("APROBADO");
        else if (pro < 7.0)
            System.out.println("REPROBADO");
        
        // Muestra del resultado
        System.out.println("Tu promedio es:" + pro);
    }
    
}
