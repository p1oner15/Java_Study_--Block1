import javax.swing.*;

public class Conditional {
    public static void main(String[] args) {
        String in;
        in = JOptionPane.showInputDialog(null, "Введите число", JOptionPane.QUESTION_MESSAGE);
        double n = Double.parseDouble(in);
        if (n > 0) System.out.println("Вы ввели положительное число");
        else if (n == 0) System.out.println("Вы вввели ноль");
        else System.out.println("Вы ввели отрицательное число");



    }
}
