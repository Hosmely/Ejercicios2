package EjercicioEnclase2.Ejercicios2.EjercicioHilosYArchivos;

import java.io.File;

public class principal {
    public static void main(String[] args){

        File archivo1 = new File("C:\\Users\\tismi\\Downloads\\texto1.txt");
        File archivo2 = new File("C:\\Users\\tismi\\Downloads\\texto2.txt");
        File archivo3 = new File("C:\\Users\\tismi\\Downloads\\texto3.txt");
        
        Hilos nuevo1 = new Hilos(archivo1);
        Hilos nuevo2 = new Hilos(archivo2);
        Hilos nuevo3 = new Hilos(archivo3);

        Thread hilo1 = new Thread(nuevo1);
        Thread hilo2 = new Thread(nuevo2);
        Thread hilo3 = new Thread(nuevo3);

        hilo1.start();
        try {
            hilo1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hilo2.start();
        try {
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo3.start();
    }
}
