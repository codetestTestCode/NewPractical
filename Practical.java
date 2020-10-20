public class Practical {
    public static void main(String[] args) {
        int b = 1; // 0001
        for (int i = 0; i <= 100; i++) {
            int app = i & b;
            if (app == b) {
                while (app == b) {
                    System.out.print(i+":");
                    app++;
                }
            } else {
                while (app != b) {
                    System.out.println(i);
                    app++;
                }

            }
        }
    }
}
