import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int t = sc.nextInt();

        int result = (v * t) % 109;

        if (result < 0) {
            result += 109;
        }

        System.out.println(result);
    }
}