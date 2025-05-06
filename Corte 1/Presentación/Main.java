import javax.swing.JOptionPane;

public class Main { 

    private Operations operations;

    public static void main(String[] args) {
        Main mainApp = new Main();
        mainApp.OperationsGUI();  // Aquí se lanza la GUI
    }

    void OperationsGUI() {
        operations = new Operations();
        iniciar();
    }

    private void iniciar() {
        try {
            String inputA = JOptionPane.showInputDialog("Introduce el primer número (A):");
            double a = Double.parseDouble(inputA);

            String inputB = JOptionPane.showInputDialog("Introduce el segundo número (B):");
            double b = Double.parseDouble(inputB);

            Values value = new Values();
            value.setA(a);
            value.setB(b);

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

            double resultado = 0;

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

            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: debes ingresar números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

//Este codigo realiza suma, resta y multiplicación con una interfaz grafica JOptionpane, puede o no funcionar debido a los permisos del administrador 
