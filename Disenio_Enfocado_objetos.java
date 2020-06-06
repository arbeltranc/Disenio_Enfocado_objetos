/*
Diseñe un algoritmo que le permita ingresar un objeto con sus respectivos
atributos y servicios en un diseño experimental de un vehículo autónomo
 */
package disenio_enfocado_objetos;

/**
 *
 * @author Alex Beltran
 */
import java.util.Scanner;
public class Disenio_Enfocado_objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner objeto=new Scanner (System.in);
        System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("INGENIERÍA AUTOMOTRIZ\n");
        System.out.println("DISEÑO ENFOCADO A OBJETOS\n");
        
        System.out.println("Ingrese el objeto del mundo real:");
        String objetoreal=objeto.nextLine();
        
        System.out.println("\nIngrese los atributos del objeto:");
        String atributo1=objeto.nextLine();
        String atributo2=objeto.nextLine();
        String atributo3=objeto.nextLine();
        
        System.out.println("\nIngrese los servicios del objeto:");
        String servicios1=objeto.nextLine();
        String servicios2=objeto.nextLine();
        String servicios3=objeto.nextLine();
        
    }
    
}
