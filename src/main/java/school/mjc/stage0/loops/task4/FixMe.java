package school.mjc.stage0.loops.task4;

public class FixMe {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {

            if (i % 2 == 0 && i != 8) {
                System.out.println(i);
            }
            else if (i == 7) {
                System.out.println("last");

                System.out.println("will I be printed?");
            }
            else if (i >= 8) {
                break;
            }
        }
    }
}
