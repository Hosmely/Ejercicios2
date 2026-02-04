public class EmpleadoFijo extends Empleado {
    
    @Override
    public double CalcularSalario() {
      double Sueldoanual = 120000;
      return  Sueldoanual/12;

    }
}
