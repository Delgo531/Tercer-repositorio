import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int numero1 =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer digito: "));
        int numero2 =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo digito: "));
        int numero3 =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer digito: "));
        int resultado = (numero1 + numero2 + numero3) / 3;
        JOptionPane.showMessageDialog(null, resultado);

    }
}