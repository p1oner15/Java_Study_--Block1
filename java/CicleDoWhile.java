import javax.swing.*;

public class CicleDoWhile {
    public static void main(String[] args) {
        String in;
        int n = 1;
        do {
            in = JOptionPane.showInputDialog(null, "Введите положительное число");
            if (in != null && !in.equals("")) {
                n = Integer.parseInt(in);
                if (n <= 0) {
                    JOptionPane.showMessageDialog(null,"Вы ввели отрицательное число");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Вы ничего не ввели");
            }

        } while (in == null || in.equals("") || n <= 0);
        JOptionPane.showMessageDialog(null, "Спасибо!");
    }
}
