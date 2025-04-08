package misrc;

import java.util.Scanner;


public class PrincipalMenu {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Calculadora calc = new Calculadora();
        while(true) {
            System.out.println("[1] Sumar");
            System.out.println("[2] Restar");
            System.out.println("[3] Salir");
            
            System.out.println("Ingresa una opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    int num1 = sc.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int num2 = sc.nextInt();
                    int suma = calc.sumar(num1, num2);  // Llamar al método sumar
                    System.out.println("El resultado de la suma es: " + suma);
                    break;
                                    
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    num1 = sc.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = sc.nextInt();
                    int resta = calc.restar(num1, num2);  // Llamar al método restar
                    System.out.println("El resultado de la resta es: " + resta);
                    break;
                    
                case 3:
                    // Salir
                    System.out.println("¡Hasta luego!");
                    sc.close();
                    return;  // Salir del programa
                
                default:
                    System.out.println("Opción no válida, por favor seleccione una opción válida.");
            }
        }
    }
}
