import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {

        int op;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("-----Menú-----");
            System.out.println("1. Cuenta Bancaria");
            System.out.println("2. Polimorfismo con Empleados");
            System.out.println("3. Ocultamiento de Atributos");
            System.out.println("4. Arrays y Referencias");
            System.out.println("5. Sistema de Figuras (Polimorfismo)");
            System.out.println("6. Gestión de Productos");
            System.out.println("7. Inventario con Arrays");
            System.out.println("8. Copia de Arrays");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            op = scan.nextInt();
            
            switch (op) {
                case 1:
                    CuentaBancaria cuenta = new CuentaBancaria();
                    System.out.println("Cuenta Bancaria");
                    cuenta.setNumeroCuenta("0031511");
                    cuenta.depositar(10000);
                    cuenta.retirar(5000);
                    cuenta.getSaldo();
                    break;

                case 2:
                    EmpleadoFijo empleadoFijo = new EmpleadoFijo();
                    empleadoFijo.CalcularSalario();
                    EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora();
                    empleadoPorHora.CalcularSalario();
                    break;

                case 3:
                    A b = new B();
                    System.out.println(b.atributo); 
                    break;

                case 4:
                    System.out.println("Arrays");
                    Array array = new Array();
                    array.modificar();
                    array.mostrar();
                    break;

                case 5:
                    System.out.println("Sistema de Figuras ");
                    Figura[] figuras = new Figura[3];
                    figuras[0] = new Cuadrado(4);
                    figuras[1] = new Rectangulo(5, 3);
                    figuras[2] = new Circulo(7);

                    for (Figura figura : figuras) {
                        System.out.println("area: " + figura.area());
                    }
                    break;

                case 6:
                    Producto producto = new Producto("Camisa", 200, 100);
                    System.out.println("Producto: " + producto.getNombre());
                    System.out.println("Precio: " + producto.getPrecio());
                    System.out.println("Stock: " + producto.getStock());

                    break;

                case 7:
                    Producto[] inventario = new Producto[3];
                    inventario[0] = new Producto("Camisa", 200, 50);
                    inventario[1] = new Producto("Pantalon", 1000, 30);
                    inventario[2] = new Producto("Zapatos", 500, 10);

                    double valorTotal = 0;
                    for (Producto p : inventario) {
                        if (p.getStock() > 0) {
                            System.out.println("Producto: " + p.getNombre() + ", Precio: " + p.getPrecio() + ", Stock: " + p.getStock());
                            valorTotal += p.getPrecio() * p.getStock();
                        }
                    }
                    System.out.println("Valor total del inventario: " + valorTotal);
                    break;

                case 8:
                    int[] original = {1, 2, 3, 4, 5};
                    int[] copiaSuperficial = original.clone();

                    copiaSuperficial[0] = 10; 

                    System.out.println("Array original: ");
                    for (int num : original) {
                        System.out.print(num + " ");
                    }
                    System.out.println();

                    System.out.println("Array copiado: ");
                    for (int num : copiaSuperficial) {
                        System.out.print(num + " ");
                    }

                    // Explicacion:
                    // La copia superficial crea una nueva referencia al array original,
                    // por lo que si modificamos los elementos de la copia estos no afectan el original.
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        } while (op != 0);
    }
}
