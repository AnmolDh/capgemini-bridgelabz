import java.util.Scanner;

class CalcHandshake {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = scanner.nextInt();
        int handshakes = calculateHandshakes(numberOfStudents);

        System.out.println("Maximum number of handshakes possible: " + handshakes);
    }
}
