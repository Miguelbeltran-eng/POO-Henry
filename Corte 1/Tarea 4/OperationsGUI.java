import javax.swing.JOptionPane;

public class OperationsGUI {

    private Operations operations;

    public OperationsGUI() {
        operations = new Operations();
        iniciar();
    }

    private void iniciar() {
        try {
            // Pedir primer número
            String inputA = JOptionPane.showInputDialog(null, "Introduce el primer número (A):");
            int a = Integer.parseInt(inputA);

            // Pedir segundo número
            String inputB = JOptionPane.showInputDialog(null, "Introduce el segundo número (B):");
            int b = Integer.parseInt(inputB);

            // Crear Values y asignar a y b
            Values value = new Values();
            value.setA(a);
            value.setB(b);

            // Elegir operación
            String[] options = {"Sumar", "Restar", "Multiplicar"};
            int selected = JOptionPane.showOptionDialog(
                    null,
                    "Elige una operación",
                    "Operaciones",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            int resultado = 0;

            switch (selected) {
                case 0:
                    resultado = operations.sumar(value);
                    break;
                case 1:
                    resultado = operations.restar(value);
                    break;
                case 2:
                    resultado = operations.multiplicar(value);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No se seleccionó ninguna operación.");
                    return;
            }

            // Mostrar resultado
            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: debes ingresar números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new OperationsGUI();
    }
}
