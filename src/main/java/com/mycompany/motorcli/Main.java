import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion = "3";
        
        while (!opcion.equals("4")) {
            // Obtener la fecha y hora actuales
            LocalDateTime fechaHoraActual = LocalDateTime.now();
            
            // Limpiar la pantalla
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            System.out.println("Sistema para el control de un motor de corriente directa");
            System.out.println("Desarrollado por Fontes");
            System.out.println(fechaHoraActual);
            
            System.out.println("Menu");
            System.out.println("1. Girar en sentido horario");
            System.out.println("2. Girar en sentido antihorario");
            System.out.println("3. Detener el motor");
            System.out.println("4. Salir");
            
            if(opcion.equals("1")) {
                System.out.println("Estado del motor: Girando en sentido horario");
            } else if(opcion.equals("2")) {
                System.out.println("Estado del motor: Girando en sentido antihorario");
            } else if(opcion.equals("3")) {
                System.out.println("Estado del motor: Detenido");
            }
            
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextLine();
        }
        
        System.out.println("Saliendo del sistema...");
        scanner.close();
    }
}
