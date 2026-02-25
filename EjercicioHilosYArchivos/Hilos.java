package EjercicioEnclase2.Ejercicios2.EjercicioHilosYArchivos;
import java.io.*;

public class Hilos implements Runnable {
    File f;

    public Hilos(File archivo){
        this.f = archivo;
    }

    public void run(){
        try {
            BufferedReader r = new BufferedReader(new FileReader(f));
            String linea = r.readLine();

        } catch (IOException e) {
            System.out.print("El archivo no ha podido ser encontrado/ Leido." + e.getMessage());
        }

    }

   

}
