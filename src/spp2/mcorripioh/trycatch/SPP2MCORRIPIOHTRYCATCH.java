/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mcorripioh.trycatch;
import java.util.Scanner;
/**
 *
 * @author MayteCorripio
 */
public class SPP2MCORRIPIOHTRYCATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int r1, r2, r3;
        r1= solicitaEntero ("la primera resistencia");
        r2= solicitaEntero ("la segunda resistencia");
        r3= solicitaEntero ("la tercera resistencia");
    }
    public static int solicitaEntero (String mensaje){
        //Instanciamos nuestro teclado
        Scanner kb = new Scanner (System.in);
        int varEntera=0;
        boolean flag;
        
        do { 
            System.out.println("Introduce " + mensaje);
            try{
                //Código que puede producir un error (Excepcion)
                varEntera = kb.nextInt();
                flag = false;
            } catch (Exception ex){
                //Código para el manejo del error
                System.out.println("Introdujiste algo que no es entero " +ex);
                flag = true;
                 kb.nextLine();
            }
        } while (flag);
        return varEntera;
    }
    
}
