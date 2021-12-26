import javax.swing.*;

public class Conditional_2 {
    public static void main(String[] args) {
        String in;
        double n = 0.1;
        double a = 0.1;
        in = JOptionPane.showInputDialog(null, "Введите положительное число");
        if (in != null && !in.equals("")) {
            n = Double.parseDouble(in);
            System.out.println(n);
            in = JOptionPane.showInputDialog(null, "Введите число отличное от нуля");
            if (in != null && !in.equals("")) {
                a = Double.parseDouble(in);
                System.out.println(n);
                if (a == 0) {
                    JOptionPane.showMessageDialog(null, "Результат бесконечность");
                } else {
                    JOptionPane.showMessageDialog(null, n + " / " + a + " = " + (n/a));
                }
            } else {
                JOptionPane.showMessageDialog(null, "Вы ничего не ввели");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Вы ничего не ввели");
        }
    }
}
