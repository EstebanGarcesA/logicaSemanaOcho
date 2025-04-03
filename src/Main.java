import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        una empresa desea registrar la informacion de cada empleado, para ello un empleado debe ingresar con su usuario y contraseña
//        una vez ingresado el empleado debe registrar la siguiente informacion
//        1 - nombre completo
//        2 - DNI
//        3 - valor de la hora
//        4 - cantidad de horas
//        5 - seleccionar un dia de descanso a la semana (L - V)
//        el sistema le debe mostrar al empleado:
//
//        su salario neto, salalario bruto, deducción por pension, deducción por salud, auxilio de transporte (si aplica) y bonificación del 10% si no supera 2 SMMLV (sin incluir auxilio de transporte)
//        toda la informacion del empleado se debe mostrar en un mensaje descriptivo

        // definición y asignación de variables
        Scanner sc = new Scanner(System.in);
        String nombreEmpleado = "";
        String documentoIdentidad = "";
        String diaDescanso = "";
        String usuarioEmpleado = "";
        String contrasenaUsuario = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double retencionSalud = 0;
        double retencionPension = 0;
        double valorHora = 0;
        double cantidadHoras = 0;
        double bonificacionEmpleado = 0;
        int auxilioTransporte = 200000;

        System.out.println("Ingrese el usuario");
        usuarioEmpleado = sc.nextLine();
        System.out.println("Ingrese la contraseña");
        contrasenaUsuario = sc.nextLine();

        if(usuarioEmpleado.equals("admin")){
            System.out.println("ha ingresado de forma correcta");
        }

























    }
}