import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Ingrese la cantidad de productos: ");
        int n = sc.nextInt();
        
        
        int[] cantidades = new int[n];
        double[] costos = new double[n];
        double total = 0;

        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la cantidad del producto " + (i + 1) + ": ");
            cantidades[i] = sc.nextInt();
            
            System.out.print("Ingrese el costo del producto " + (i + 1) + ": ");
            costos[i] = sc.nextDouble();
            
            
            total += cantidades[i] * costos[i];

            
            if (cantidades[i] * costos[i] > 1000) {
                System.out.println("Producto " + (i + 1) + " supera los $1000: " + (cantidades[i] * costos[i]));
            }
        }

        // Mostrar el precio total
        System.out.println("El precio total de todos los productos es: $" + total);
        
        sc.close();
    }
}
