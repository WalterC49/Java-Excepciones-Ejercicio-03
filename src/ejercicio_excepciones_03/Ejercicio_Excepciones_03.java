/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para
leer dos números en forma de cadena. A continuación, utilice el método parseInt() de la
clase Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de tipo
int. Por ultimo realizar una división con los dos numeros y mostrar el resultado.
*/
package ejercicio_excepciones_03;

import ejercicio_excepciones_03.servicios.MainServicio;

/**
 *
 * @author Walter
 */
public class Ejercicio_Excepciones_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa lee 2 números enteros y luego los divide.");
        
        int numero1=0,numero2=0;
        
        boolean repetir;
        do {            
            repetir=false;
            
            try {
                System.out.print("\nIngrese el 1er número: ");
                numero1=Integer.parseInt(MainServicio.leer.next());
                System.out.print("Ingrese el 2do número: ");
                numero2=Integer.parseInt(MainServicio.leer.next());
                
                if(numero1==0 && numero2==0){
                    throw new ArithmeticException("La división de estos números no está definida.");
                }
                
            } catch (NumberFormatException e) {
                System.out.println("\nIngrese Nº enteros por favor.");
                repetir=true;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                repetir=true;
            }
            
        } while (repetir);
        
        MainServicio.MostrarRsultado(numero1,numero2);
        System.out.println("\nPrograma finalizado.");
    }
    
}
