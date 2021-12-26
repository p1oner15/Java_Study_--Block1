import javax.swing.*;

public class CicleWhile {
    public static void main(String[] args) {
        String in;
        int n = 0;
        double fact = 1;
        int f = 1;
        in = JOptionPane.showInputDialog(null, "Введите неотрицательное число");
        if (in != null && !in.equals("")) {
            n = Integer.parseInt(in);
            if (n < 0) {
                JOptionPane.showMessageDialog(null, "Вы ввели отрицательное число");
            }
            while (f < n) {
                f++;
                fact *= f;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Вы ничего не ввели");
        }
        JOptionPane.showMessageDialog(null, "Факториал числа " + n + " = " + (fact));
    }
}
