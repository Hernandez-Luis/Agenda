public class Contacto {
    String nombre;
    String apellido;
    String empresa;
    int telefono;
    String correo;
    String cumple;
    public Contacto(String nombre,String apellido,String empresa,int telefono,String correo,String cumple){
        this.nombre = nombre;
        this.apellido = apellido;
        this.empresa = empresa;
        this.telefono = telefono;
        this.correo = correo;
        this.cumple = cumple;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + " Apellido: " + apellido + " Empresa: " + empresa + " Telefono: " + telefono + " Correo: " + " Cumpleaños: " + cumple;
    }

}
