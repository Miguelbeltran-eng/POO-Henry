
import javax.swing.JOptionPane;

public class CajeroElectronico {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(0); // Saldo inicial
        boolean continuar = true;


        while (continuar) {
            String[] opciones = {"Depositar", "Retirar", "Consultar saldo", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Seleccione una operación a realizar:", "Cajero Electrónico",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (opcion) {
                case 0: // Depositar
                    String depositoStr = JOptionPane.showInputDialog("Ingrese la cantidad a depositar:");
                    try {
                        double cantidad = Double.parseDouble(depositoStr);
                        double saldoAnterior = cuenta.getSaldo();
                        if (cuenta.depositar(cantidad)) {
                            JOptionPane.showMessageDialog(null, "Depósito exitoso.\nSaldo anterior: $" + saldoAnterior + "\nSaldo actual: $" + cuenta.getSaldo());
                        } else {
                            JOptionPane.showMessageDialog(null, "Cantidad inválida para depósito.","Valor Invalido", JOptionPane.WARNING_MESSAGE);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida.");
                    }
                    break;

                case 1: // Retirar
                    String retiroStr = JOptionPane.showInputDialog("Ingrese la cantidad a retirar:");
                    try {
                        double cantidad = Double.parseDouble(retiroStr);
                        double saldoAnterior = cuenta.getSaldo();
                        if (cuenta.retirar(cantidad)) {
                            JOptionPane.showMessageDialog(null, "Retiro exitoso.\nSaldo anterior: $" + saldoAnterior + "\nSaldo actual: $" + cuenta.getSaldo());
                        } else {
                            JOptionPane.showMessageDialog(null, "No se pudo realizar el retiro.\nSaldo disponible: $" + cuenta.getSaldo(), "Advertencia", JOptionPane.WARNING_MESSAGE);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Entrada inválida.");
                    }
                    break;

                case 2: // Consultar saldo
                    JOptionPane.showMessageDialog(null, "Su saldo actual es: $" + cuenta.getSaldo());
                    break;

                default: // Salir
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "Gracias por usar el cajero.");
                    break;
            }
        }
    }
}
