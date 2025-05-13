public class CuentaBancaria {
    // Atributo privado
    private double saldo;

    // Constructor público
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método público para obtener el saldo actual, esto para antes y después de un deposito o retiro
    public double getSaldo() {
        return saldo;
    }

    // Método público para depositar
    public boolean depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            return true;
        }
        return false;
    }

    // Método público para retirar
    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

}


