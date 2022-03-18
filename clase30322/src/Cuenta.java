public class Cuenta {

    private long nroCuenta;
    private CLiente cLiente;
    private char tipoCuenta;
    private double saldo;

    public Cuenta(long nroCuenta, CLiente cLiente, char tipoCuenta, double saldo) {
        this.nroCuenta = nroCuenta;
        this.cLiente = cLiente;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public long getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(long nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public CLiente getcLiente() {
        return cLiente;
    }

    public void setcLiente(CLiente cLiente) {
        this.cLiente = cLiente;
    }

    public char getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(char tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double cantidad) throws AccountException{

        if (cantidad <= 0){
            throw new AccountException("La cantidad a depositar no esta permitida");
        }else {
            saldo += cantidad;
        }

    }

    public void retirar(double cantidad) throws AccountException{

    }
}
