import java.util.Scanner;
public class Menu {
    
 public static void main(String[] args){

    int op;
    do{
        System.out.println("-----Menu-----");
        System.out.println("1. Cuenta Bancaria");
        System.out.println("2. Polimorfismo con Empleados");
        System.out.println("3. Ocultamiento de Atributos");
        System.out.println("4. Arrays y Referencias");
        System.out.println("0. Salir");
        System.out.println("Opcion: ");
        Scanner scan = new Scanner(System.in);
         op = scan.nextInt();

        switch (op) {
            case 1:
                CuentaBancaria cuenta = new CuentaBancaria();
                System.out.println("Cuenta Bancaria");
                cuenta.setNumeroCuenta("12345489");
                cuenta.depositar(10000);
                cuenta.retirar(5000);
                cuenta.getSaldo();
                break;
            case 2:
                System.out.println("Empleado: ");
                EmpleadoFijo Empleado = new EmpleadoFijo();
                Empleado.CalcularSalario();
                EmpleadoPorHora empleado = new EmpleadoPorHora();
                empleado.CalcularSalario();
                break;
            case 3:
                A b = new B();
               System.out.println(b.atributo); 
            default:
                break;
        }
    }while(op !=0);
 }
}
