import java.util.Scanner;

public class Menu {
    public int opciones(Scanner scanner){
        System.out.println("- - M E N U - -");
        System.out.println("1.- Tamaño de la agenda");
        System.out.println("2.- Registrar contacto");
        System.out.println("3.- Mostrar contactos");
        System.out.println("4.- Salir");
        return scanner.nextInt();
    }
}
