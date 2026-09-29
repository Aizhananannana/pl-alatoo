import java.util.Scanner;

public class Taskt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = n / 1000;
        int b = n / 100 % 10;
        int c = n / 10 % 10;
        int d = n % 10;

        int result = (a - d) * (a - d) + (b - c) * (b - c);

        System.out.println(result == 0 ? 1 : 0);
    }
}
