import java.util.Scanner;

public class Registro {
    Contacto [] contacto;
    public  Contacto [] ingresaContacto(Scanner scanner,int y){
        contacto = new Contacto[y];

        for(int i=0;i<contacto.length;i++){
            System.out.println("Nombre: ");
            String nombre = scanner.next();
            System.out.println("Apellido: ");
            String apellido = scanner.next();
            System.out.println("Empresa: ");
            String empresa = scanner.next();
            System.out.println("Telefono: ");
            int telefono = scanner.nextInt();
            System.out.println("Correo: ");
            String correo = scanner.next();
            System.out.println("Cumpleaños");
            String cumple = scanner.next();
            contacto [i] = new Contacto(nombre,apellido,empresa,telefono,correo,cumple);
        }
        return contacto;
    }
}