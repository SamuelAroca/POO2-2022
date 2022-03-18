package co.edu.unac.poo2.cl03;

public class Cuenta {
    
    private long nroCuenta;
    private Cliente cliente;
    private char tipoCuenta;
    private double saldo;

    public Cuenta(long nroCuenta, Cliente cliente, char tipoCuenta, double saldo) {
        this.setNroCuenta(nroCuenta);
        this.setCliente(cliente);
        this.setTipoCuenta(tipoCuenta);
        this.saldo = saldo;
    }

    public char getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(char tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(long nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double cantidad) throws AccountException {
        if (cantidad <= 0) {
            throw new AccountException("La cantidad a depositar no está permitida");
        } else {
            saldo += cantidad;
        }
    }

    public void retiro(double cantidad) throws AccountException {
        if (cantidad <= 0) {
            throw new AccountException("La cantidad a retirar no está permitida");
        } else if ((saldo - cantidad) < 0) {
            throw new AccountException("La cantidad a retirar no está disponible");
        } else {
            saldo -= cantidad;
        }
    }
}
