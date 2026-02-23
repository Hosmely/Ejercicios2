package EjercicioEnclase2.Ejercicios2.Ejercicios12y14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.Scanner;



public class principal {
    public static void main(String[] args){
        File archivo = new File("Estudiantes.dat");
        FileReader file;
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
            } catch (IOException e) {
                System.out.println("El archivo con este nombre ya existe." + e.getMessage());
            }
                
        }else{
            try{
                file = new FileReader(archivo);
                String contenido = file.toString();
                System.out.println(contenido);
            }catch(FileNotFoundException fnfe){               
                System.out.println("El archivo con este nombre no existe." + fnfe.getMessage());
            }
        }



        Scanner scan = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Buscar Estudiante");
            System.out.println("3. Agregar Estudiante");
            System.out.println("0. Salir\n");
            
            opcion = scan.nextInt();
            scan.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el nombre del estudiante.");
                String nombre = scan.nextLine();
                System.out.println("Ingrese la matricula del estudiante.");
                String matricula = scan.nextLine();
                System.out.println("Ingrese el promedio del estudiante.");
                double promedio = scan.nextDouble();
                Estudiante e = new Estudiante(nombre, matricula, promedio);
                try{
            
                   ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("Estudiantes.dat")) ; 
                    ois.writeObject(e);
                    ois.close();
                   
                }catch(IOException ioe){
                    System.out.println("El archivo pudo pudo ser abierto para escribir.");
                }
                break;
    
            case 2:
                System.out.println("Ingrese el numero de matricula.");
                String m = scan.nextLine();
                try{
                    RandomAccessFile rand = new RandomAccessFile(archivo, "r");
                    rand.close();
                }catch(Exception e2){
                    System.out.println(e2.getMessage());
                }

            case 0:
                break;
                
            default:
            System.out.println("Opcion no valida.");

                break;
        }
            
            

        }



        while(opcion != 0);

    scan.close();

}
}
