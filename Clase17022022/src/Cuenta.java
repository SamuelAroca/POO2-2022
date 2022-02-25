public abstract class Cuenta {
    
    protected String numeroCuenta;
    protected String titular;
    protected double saldo;
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public abstract void depositar(double cantidad);
    public abstract void retirar(double cantidad);
    public abstract double consultarSaldo();
}
