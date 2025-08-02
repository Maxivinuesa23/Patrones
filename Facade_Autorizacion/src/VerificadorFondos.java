public class VerificadorFondos {
    public boolean tieneFondosSuficientes(String numeroCuenta, double monto){
        System.out.println("Verificando fondos suficientes....");
        return monto <= 10000;
    }
}
