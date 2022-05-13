/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_excepciones_03.servicios;

import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class MainServicio {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static float Dividir(int num1,int num2) throws ArithmeticException{
        String respuesta;
        boolean repetir;
        do {            
            repetir=false;
            System.out.println("\nElija el ordén de la división:"
                    + "\nA- "+num1+"/"+num2
                    +"\nB- "+num2+"/"+num1);
            System.out.print("Opción: ");
            respuesta=leer.next().toUpperCase();
            
            switch (respuesta) {
                case "A":
                case "B":
                    break;
                default:
                    System.out.println("Ingreso no valido.");
                    repetir=true;
                }
        } while (repetir);
        
        try {
            if(respuesta.equals("A")){
                return num1/num2;
            }else{
                return num2/num1;
            }
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Por definición no se puede dividir por cero.");
        }
    }
    
    public static void MostrarRsultado(int num1, int num2){
        try {
            float resultado=MainServicio.Dividir(num1, num2);
            System.out.println("\nEl resultado de la divición es "+resultado);
        } catch (ArithmeticException e) {
            System.out.println("\n"+e.getMessage());
            ContinuarOSalir(num1, num2);
        }    
    }
    
    public static void ContinuarOSalir(int num1, int num2){
        System.out.println("Precione \"S\" para elegir de vuelta caso contrario cualquier tecla para salir.");
        String respuesta=leer.next();
        
        if(respuesta.equals("S")){
            MostrarRsultado(num1, num2);
        }
    }
    
}
