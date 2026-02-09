package Capitulos8y9;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import javax.management.InvalidAttributeValueException;
    
    public class Menu {
        
        public static void main(String[] args) {
            Calendar calendario = Calendar.getInstance();
            int op;
            Scanner scan = new Scanner(System.in);
            String fecha = calendario.getTime().toString();
            Reserva reserva = null;
            do {
                System.out.println("-----Menú-----");
                System.out.println("1. Registrar Reservas");
                System.out.println("2. Mostrar Reserva");
                System.out.println("0. Salir");
                System.out.print("Opcion: ");
                op = scan.nextInt();
                scan.nextLine();
                
                switch (op) {
                    case 1:
                        System.out.println("Ingrese el nombre del cliente");
                        String nombre = scan.nextLine();
                        System.out.println("Ingrese el la cantidad de personas");
                        int cantidad = scan.nextInt();
                        System.out.println("Ingrese la fecha: ");
                        String fechar = scan.nextLine();
                        try {
                          reserva = new Reserva(nombre, fechar, cantidad);
                        } catch (InvalidAttributeValueException AtributosInvalidos) {
                            AtributosInvalidos.printStackTrace();
                        }

                        break;
                    case 2:
                        System.out.println(reserva.getNombreCliente() + reserva.getFecha() +reserva.getCantidad() );
                    case 0:
                        break;
    
                    default:
                        System.out.println("Opcion invalida.");
                        break;
                }
            } while (op != 0);
        }
    }
    


