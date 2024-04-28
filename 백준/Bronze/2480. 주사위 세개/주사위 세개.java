import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c = 0;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a < 1 || a > 6 || b < 1 || b > 6 || c < 1 || c > 6) {
            System.out.println("1~6의 값을 입력하세요.");
        } else if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
        } else if (a == b || c == a) {
            System.out.println(1000 + a * 100);
        } else if (b == c) {
            System.out.println(1000 + b * 100);
        } else {
            int max1 = Math.max(a, b);
            int max2 = Math.max(b, c);
            System.out.println(Math.max(max1, max2) * 100);
        }
    }
}
