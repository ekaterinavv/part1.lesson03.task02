import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        double q;
        int qRound;
        System.out.println("Input n:");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];

        //Генерация N случайных чисел.
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(1000) - 50;
        }

        //Для каждого числа k вычислить квадратный корень q.
        // Если квадрат целой части q числа равен k, то вывести это число на экран.
        // Предусмотреть что первоначальные числа могут быть отрицательные, в этом случае генерировать исключение.
        for (int k : arr) {
            if (k < 0) {
                throw new Exception("k = " + k + " is negative number");
            }
            q = Math.sqrt(k);
            qRound = (int) Math.round(Math.sqrt(k));
            if (k == (Math.pow(qRound, 2))) {
                System.out.println("k = " + k + ", q = " + q);
            }
        }
    }
}
