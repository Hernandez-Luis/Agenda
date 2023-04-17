public class Muestra {

    public void muestraContacto(int y,Registro registro){
        System.out.println("- - C O N T A C T O S - -");
        for(int i=0;i<y;i++){
            System.out.println(registro.contacto[i].toString());
            System.out.println("\n______________________________________________________\n");
        }
    }
}
