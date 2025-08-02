public class Main {
    public static void main(String[] args) {

        BancoFacade banco = new BancoFacade();

        banco.realizarTransferencia("12345", 5000, "clave123");
        System.out.println("---");
        banco.realizarTransferencia("54321", 5000, "clave123");
        System.out.println("---");
        banco.realizarTransferencia("12345", 15000, "clave123");
        System.out.println("---");
        banco.realizarTransferencia("12345", 5000, "clave53333");

    }
}