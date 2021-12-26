import javax.swing.*;

public class CIcleFor_HOME {
    public static void main(String[] args) {
        String in;
        int n = 1;
        in = JOptionPane.showInputDialog("Введите целое положительное число");
        if (in != null && !in.equals("")) {
            n = Integer.parseInt(in);
            System.out.println(n);
            if (n < 0) {
                JOptionPane.showMessageDialog(null, "Вы ввели число меньше нуля!");
            }
            if (n == 0) {
                JOptionPane.showMessageDialog(null, "Вы ввели ноль");
            }
            String summa = "";
            int b = 1;
            b = Integer.parseInt(in);
            int c = 0;
            for (int i = 1; i <= b; i++) {
                if (i != b) {
                    summa += i + " + ";
                } else {
                    summa += i;

                }
                c += i;
            }
            JOptionPane.showMessageDialog(null, "Cумма чисел равна - " + summa + " = " + c);

        } else {
            JOptionPane.showMessageDialog(null, "Вы не ввели число!");
        }
    }
}
