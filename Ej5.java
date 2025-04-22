import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("\nCliente " + (i + 1));
            
            System.out.print("Ingrese el DNI del cliente: ");
            String dni = sc.next();
            
            System.out.print("Ingrese el tipo de servicio (1. 30 megas, 2. 50 megas, 3. 100 megas): ");
            int tipoServicio = sc.nextInt();
            
            double montoAPagar = 0;
            int numeroServicio = 0;
            
            switch (tipoServicio) {
                case 1:
                    montoAPagar = 750;
                    numeroServicio = 1;
                    break;
                case 2:
                    montoAPagar = 1100;
                    numeroServicio = 2;
                    break;
                case 3:
                    montoAPagar = 1500;
                    montoAPagar -= montoAPagar * 0.05;  // Descuento del 5% para 100 megas
                    numeroServicio = 3;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    continue;
            }
            
            System.out.println("DNI del cliente: " + dni);
            System.out.println("Monto a pagar: $" + montoAPagar);
            System.out.println("Número de servicio: " + numeroServicio);
        }
        
        sc.close();
    }
}
