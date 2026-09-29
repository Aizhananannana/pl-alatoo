import java.util.Scanner;

public class Taskq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int days = (m + n - 1) / n;

        System.out.println(days);
    }
}
