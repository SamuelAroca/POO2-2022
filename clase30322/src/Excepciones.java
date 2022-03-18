public class Excepciones {
    public static void main(String[] args) {

        CLiente cLiente = new CLiente(123123142,"Samuel", "Aroca", "samuelaroldo1@hotmail.com",305235234);
        Cuenta cuenta = new Cuenta(34334, cLiente,'a',3500000);

        try {
            cuenta.deposito(-30000);
            System.out.println("Su nuevo saldo es: " + cuenta);

        }catch (Exception e){
            System.out.println("Error"+e.getMessage());

        }finally {

        }

    }
}
