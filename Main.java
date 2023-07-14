class Persona {
    int Edad;
    String Nombre;
    String Telefono;

public Persona (int Edad, String Nombre, String Telefono){
    this.Edad = Edad;
    this.Nombre = Nombre;
    this.Telefono = Telefono;
    }
}

class Cliente extends Persona {
    double Credito;

    public Cliente (int Edad, String Nombre, String Telefono, double Credito){
        super(Edad, Nombre, Telefono);
        this.Credito = Credito;
    }
    public double getCredito(){
        return Credito;
    }
}

class Trabajador extends Persona{
    double Salario;

    public Trabajador (int Edad, String Nombre, String Telefono, double Salario){
        super (Edad, Nombre, Telefono);
        this.Salario = Salario;
    }
    public double getSalario(){
        return Salario;
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente (19, "Sunflower", "5567811234", 2000.0);

        System.out.println("Edad: " + cliente.Edad);
        System.out.println("Nombre: " + cliente.Nombre);
        System.out.println("Telefono: " + cliente.Telefono);
        System.out.println("Credito: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador(20, "Stephenie", "5567123456", 5000.0);

        System.out.println("Edad: " + trabajador.Edad);
        System.out.println("Nombre: " + trabajador.Nombre);
        System.out.println("Telefono: " + trabajador.Telefono);
        System.out.println("Salario: " + trabajador.getSalario());
    }
}
