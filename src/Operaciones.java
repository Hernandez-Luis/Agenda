import java.util.Scanner;

public class Operaciones {
    public void operaciones(){
        Scanner scanner = new Scanner(System.in);
        TamAgenda tamAgenda = new TamAgenda();
        Registro registro = new Registro();
        Menu menu = new Menu();
        Muestra muestra = new Muestra();
        Contacto [] array;
        int x=0,y=0;

        while (x!=4){
            x = menu.opciones(scanner);
            switch (x){
                case 1:
                    y = tamAgenda.tam(scanner);
                    break;
                case 2:
                    if(y!=0){
                       array = registro.ingresaContacto(scanner,y);
                    }
                    else {
                        System.out.println("Tamaño de la agenda no definida");
                    }
                    break;
                case 3:
                    muestra.muestraContacto(y,registro);
                    break;
                case 4:
                    System.out.println("Saliste del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }
        }
    }
}
