import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de notas: ");
        int n = sc.nextInt();
        int[] notas = new int[n];
        int suma = 0;
        int notaMaxima = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
            suma += notas[i];
            if (notas[i] > notaMaxima) {
                notaMaxima = notas[i];
            }
        }

        double promedio = (double) suma / n;

        System.out.println("\nNota más alta: " + notaMaxima);
        System.out.println("Promedio de notas: " + promedio);
        
        sc.close();
    }
}
