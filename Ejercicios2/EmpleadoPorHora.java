public class EmpleadoPorHora extends Empleado{
    @Override
    public double CalcularSalario() {
      double SueldoporHora = 340;
      double HorasTrabajadas = 5;
      return  SueldoporHora*HorasTrabajadas;

    }
}
