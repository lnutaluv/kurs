import java.util.Scanner

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для вычисления факториала: ");
        int number = scanner.nextInt();

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Факториал числа " + number + " равен " + factorial);
    }
}
