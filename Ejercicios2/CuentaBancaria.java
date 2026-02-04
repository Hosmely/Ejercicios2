public class CuentaBancaria {
    private double saldo;
    private String numeroCuenta;


    public CuentaBancaria(){
        saldo = 0.00;
        numeroCuenta = "000000";
    }

     void setSaldo(double saldo){
        this.saldo = saldo;
    }

     void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo(){
        return saldo;
    }
    
    public String getNumeroCuenta(){
        return numeroCuenta;
    }

    public void depositar(double monto){
        saldo +=monto;
        System.out.println("Saldo actualizado con exito");
    }

    public void retirar(double monto){
        saldo-= monto;
        System.out.println("Saldo retirado con exito");
    }
   
}
