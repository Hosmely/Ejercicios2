package EjercicioEnclase2.Ejercicios2.Ejercicios12y14;

import java.io.Serializable;

public class Estudiante implements Serializable{
    private String nombre;
    private String matricula;
    private double promedio;

    public Estudiante(String nombre, String matricula, double promedio){
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }
    public double getPromedio() {
        return promedio;
    }
    
}
