import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        float numero1 =Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer digito: "));
        float numero2 =Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo digito: "));
        float numero3 =Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tercer digito: "));
        float resultado = (numero1 + numero2 + numero3) / 3;
        JOptionPane.showMessageDialog(null, resultado);

    }
}