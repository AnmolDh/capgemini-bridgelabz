import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println(count);

        scanner.close();
    }
}
