import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cantidadCamiones = 30;
        int camionesConTe = 0;

        for (int i = 0; i < cantidadCamiones; i++) {
            System.out.println("\nCamión " + (i + 1));
            
            System.out.print("Ingrese la patente del camión: ");
            String patente = sc.next();
            
            System.out.print("Ingrese el nombre del chofer: ");
            String chofer = sc.next();
            
            System.out.print("Ingrese el apellido del chofer: ");
            String apellidoChofer = sc.next();
            
            System.out.print("Ingrese el tipo de carga (madera, yerba, té): ");
            String tipoCarga = sc.next();
            
            System.out.print("Ingrese la hora de egreso: ");
            String horaEgreso = sc.next();
            
            if (tipoCarga.equalsIgnoreCase("té")) {
                camionesConTe++;
            }
            
            System.out.println("Patente: " + patente);
            System.out.println("Chofer: " + chofer + " " + apellidoChofer);
            System.out.println("Tipo de carga: " + tipoCarga);
            System.out.println("Hora de egreso: " + horaEgreso);
        }

        System.out.println("\nCantidad de camiones que cargaron té: " + camionesConTe);
        
        sc.close();
    }
}
