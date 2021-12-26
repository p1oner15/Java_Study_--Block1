public class CycleFor {
    public static void main(String[] args) {

        for (int a = 0; a < 100; a++) {
            System.out.println(a + " ");
        }
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
