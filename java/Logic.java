public class Logic {
    public static void main(String[] args) {
        boolean b_1 = true;
        boolean b_2 = false;
        boolean b_3 = false;
        System.out.println(b_1 + " && " + b_1 + " = " + (b_1 && b_1)); // И / b_1 * b_2" / 1 * 0 = 0
        System.out.println(b_1 + " || " + b_2 + " = " + (b_1 || b_2)); // ИЛИ 1 + 0 = 1
        System.out.println(b_1 + " ^ " + b_2 + " = " + (b_1 ^ b_2)); // Различие если разные то будет тру
        System.out.println(b_3 + " ^ " + b_2 + " = " + (b_3 ^ b_2));
    }
}
