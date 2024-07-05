import project1.Auto;
import project1.Direccion;
import project1.Marca;
import project1.Propietario;

import java.time.LocalDate;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// PROYECTO 1 ----------------------------------------------------------------------------
        Direccion direccionPropietario1 = new Direccion("Calle Principal 123", "Ciudad Ejemplo", "12345");

        Marca toyota = new Marca("Toyota",10,2022,"123");

        Propietario propietario1 = new Propietario("Juan Pérez", LocalDate.of(1999,9,12), direccionPropietario1 );

        Auto coche = new Auto(toyota, "negro", propietario1, 200, 0, 4,false, 5, false, 1, "el nuevo");


        // Imprimir información para verificar las relaciones
        System.out.println("Propietario: " + propietario1.toString());
        System.out.println("Dirección: " + direccionPropietario1.toString());
        System.out.println("Auto: " + coche.toString());
        System.out.println("Marca: " + toyota.toString());
    }
// FIN PROYECTO 1 -----------------------------------------------------------------------
}