import java.util.Scanner;

public class Taskt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int first = n / 1000;
        int second = (n / 100) % 10;
        int third = (n / 10) % 10;
        int fourth = n % 10;

        int result = (first == fourth && second == third) ? 1 : 0;

        System.out.println(result);
    }
}

