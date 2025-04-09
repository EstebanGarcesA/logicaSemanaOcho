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
        // Comentario de prueba
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
        double valorSalarioMinimo = 0;
        int auxilioTransporte = 200000;

        System.out.println("Ingrese el usuario");
        usuarioEmpleado = sc.nextLine();
        System.out.println("Ingrese la contraseña");
        contrasenaUsuario = sc.nextLine();

        if(usuarioEmpleado.equals("admin") && contrasenaUsuario.equals("admin")){
            System.out.println("ha ingresado de forma correcta");
            System.out.println("Ingrese el nombre del empleado: ");
            nombreEmpleado = sc.nextLine();
            System.out.println("Ingrese el número de documento");
            documentoIdentidad = sc.nextLine();
            System.out.println("Indiqué un día de descanso de lunes a viernes");
            diaDescanso = sc.nextLine();
            System.out.println("Ingrese el valor de la hora de trabajo");
            valorHora = sc.nextDouble();
            System.out.println("Ingrese la cantidad de horas trabajadas");
            cantidadHoras = sc.nextDouble();
            System.out.println("Ingrese el valor del salario minimo de este año");
            valorSalarioMinimo = sc.nextDouble();

            salarioBruto = valorHora * cantidadHoras;
             if (salarioBruto>(valorSalarioMinimo*2)){
                 bonificacionEmpleado = 0;
                 auxilioTransporte = 0;
             } else {
                 bonificacionEmpleado = salarioBruto * 0.1;
                 auxilioTransporte = 200000;
             }
             salarioNeto = salarioBruto + bonificacionEmpleado + auxilioTransporte;
            System.out.println("El salario neto es : " + salarioNeto);


        } else {
            System.out.println("Error de credenciales");
        }
//        if(usuarioEmpleado.equals("admin")){
//            if (contrasenaUsuario.equals("admin")){
//            System.out.println("ha ingresado de forma correcta");
//        }

























    }
}