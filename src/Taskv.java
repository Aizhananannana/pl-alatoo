import java.util.Scanner;

public class Taskv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int d = a - b;
        int result = b + d * ((d + 1000) / 1000);

        System.out.println(result);
    }
}
