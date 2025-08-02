public class BancoFacade {
    private VerificadorFondos verificadorFondos;
    private VerificadorCuenta verificadorCuenta;
    private RegistroTransaccion registro;
    private Autorizador autorizador;

    public BancoFacade() {
        this.verificadorFondos = new VerificadorFondos();
        this.verificadorCuenta = new VerificadorCuenta();
        this.registro = new RegistroTransaccion();
        this.autorizador = new Autorizador();
    }

    public void realizarTransferencia(String numeroCuenta, double monto, String clave){
        System.out.println("Iniciando transferencia....");

        if (!verificadorCuenta.cuentaValida(numeroCuenta)){
            System.out.println("ERROR: Cuenta no valida.");
            return;
        }
        if (!verificadorFondos.tieneFondosSuficientes(numeroCuenta, monto)){
            System.out.println("ERROR: Fondos Insuficientes.");
            return;
        }
        if (!autorizador.autorizarOperacion(clave)){
            System.out.println("ERROR: Operacion no valida.");
            return;
        }
        registro.registrar(numeroCuenta, monto);
        System.out.println("Transferencia realizada con exito.");


    }
}
