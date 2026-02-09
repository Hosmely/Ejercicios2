package Capitulos8y9;
import java.text.DateFormat;
import java.text.ParseException;


import javax.management.InvalidAttributeValueException;
public class Reserva {
    private String nombreCliente;
    private String fechaReserva;
    private int cantidadPersonas;
    DateFormat formato = DateFormat.getDateInstance(DateFormat.SHORT);

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getFecha() {
        return fechaReserva;
    }

    public int getCantidad() {
        return cantidadPersonas;
    }

    public Reserva(String nombreCliente, String fecha,int cantidadPersonas) throws InvalidAttributeValueException{
        nombreCliente.trim();   
        try {
            formato.parse(fecha);
        } catch (ParseException fechainvalida) {
            fechainvalida.printStackTrace();
        }
        if(nombreCliente.equalsIgnoreCase(""))
            throw new InvalidAttributeValueException("El nombre no puede tener solo espacios.");
        else if(nombreCliente.isBlank())
            throw new InvalidAttributeValueException("El nombre no puede estar vacio.");
        else
            this.nombreCliente = nombreCliente;
        this.fechaReserva = fecha;
        this.cantidadPersonas = cantidadPersonas;
        if(cantidadPersonas <=0)
            throw new InvalidAttributeValueException("La cantidad de personas no puede ser menor o igual que 0");
    }
}
