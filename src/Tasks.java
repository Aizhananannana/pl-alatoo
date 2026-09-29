import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int days = (h - a + (a - b) - 1) / (a - b) + 1;

        System.out.println(days);
    }
}
