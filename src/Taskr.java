import java.util.Scanner;

public class Taskr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int fewer = n - k % n;

        System.out.println(fewer % n);
    }
}
