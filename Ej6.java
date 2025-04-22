import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numeroVehiculo = 0;
        int mejorTiempo = Integer.MAX_VALUE;

        for (int i = 0; i < 12; i++) {
            System.out.println("\nCompetidor " + (i + 1));
            
            System.out.print("Ingrese el número del vehículo: ");
            int numero = sc.nextInt();
            
            System.out.print("Ingrese el tiempo en segundos: ");
            int tiempo = sc.nextInt();
            
            if (tiempo < mejorTiempo) {
                mejorTiempo = tiempo;
                numeroVehiculo = numero;
            }
        }

        System.out.println("\nEl competidor con el menor tiempo es el vehículo " + numeroVehiculo + " con un tiempo de " + mejorTiempo + " segundos.");
        
        sc.close();
    }
}
