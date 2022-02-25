public class CuentaAhorros extends Cuenta {

    @Override
    public void depositar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Ingrese una cantidad mayor a 0.");
        } else {
            saldo += cantidad;
        }
    }

    @Override
    public void retirar(double cantidad) {
        saldo -= cantidad;
        if (saldo < 0) {
            System.out.println("La cantidad para retirar no esta disponible.");
            saldo += cantidad;
        }
    }

    @Override
    public double consultarSaldo() {
        return this.saldo;
    }
    
}
