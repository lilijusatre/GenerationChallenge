package project3;

public class EmpleadoTest {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", "Ortiz", 100.00);
        Empleado empleado2 = new Empleado("José", "López", 120.00);

        System.out.println("Salario empleado 1: " + empleado1.getSalarioMensual());
        System.out.println("Salario empleado 2: " + empleado2.getSalarioMensual());

        empleado1.setSalarioMensual(empleado1.getSalarioMensual() * 1.1);
        System.out.println("Salario aumentado de empleado 1: " + String.format("%.2f", empleado1.getSalarioMensual() * 12));

        empleado2.setSalarioMensual(empleado2.getSalarioMensual() * 1.1);
        System.out.println("Salario aumentado de empleado 2: " + String.format("%.2f", empleado2.getSalarioMensual() * 12));

    }
}
