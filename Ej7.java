import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalPersonas = 0;
        int varones = 0;
        int mujeres = 0;
        int varonesEntre16y65 = 0;
        int mayorEdad = -1;
        int dniMayorEdad = 0;
        
        while (true) {
            System.out.print("Ingrese el número de documento (0 para finalizar): ");
            int dni = sc.nextInt();
            
            if (dni == 0) {
                break;
            }
            
            System.out.print("Ingrese la edad: ");
            int edad = sc.nextInt();
            
            System.out.print("Ingrese el sexo (F/M): ");
            char sexo = sc.next().charAt(0);
            
            totalPersonas++;
            
            if (sexo == 'M' || sexo == 'm') {
                varones++;
                
                if (edad >= 16 && edad <= 65) {
                    varonesEntre16y65++;
                }
            } else if (sexo == 'F' || sexo == 'f') {
                mujeres++;
            }
            
            if (edad > mayorEdad) {
                mayorEdad = edad;
                dniMayorEdad = dni;
            }
        }
        
        System.out.println("\nTotal de personas censadas: " + totalPersonas);
        System.out.println("Cantidad de varones: " + varones);
        System.out.println("Cantidad de mujeres: " + mujeres);
        System.out.println("Porcentaje de varones entre 16 y 65 años: " + (varones > 0 ? (double) varonesEntre16y65 / varones * 100 : 0) + "%");
        System.out.println("La persona con mayor edad tiene el DNI: " + dniMayorEdad + " y tiene " + mayorEdad + " años.");
        
        sc.close();
    }
}
