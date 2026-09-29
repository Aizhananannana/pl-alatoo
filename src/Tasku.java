import java.util.Scanner;

public class Tasku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = (n % m == 0 || m % n == 0) ? 1 : 0;

        System.out.println(result);
    }
}

