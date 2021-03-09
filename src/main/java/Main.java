import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double q;
        int qRound, k;
        System.out.println("Input n:");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];

        //Генерация N случайных чисел.
        Random random = new Random();
        for (int i = 0; i < n; i++)
            arr[i] = random.nextInt(1000) - 500;

        //Для каждого числа k вычислить квадратный корень q.
        // Если квадрат целой части q числа равен k, то вывести это число на экран.
        // Предусмотреть что первоначальные числа могут быть отрицательные, в этом случае генерировать исключение.
        for (int j : arr) {
            k = j;

            if (k < 0) {
                try {
                    throw new Exception();
                } catch (Exception ex) {
                    System.out.println("k = " + k + " is negative number");
                    continue;
                }

            }
            q = Math.sqrt(k);
            qRound = (int)Math.round(Math.sqrt(k));
            if (k == (qRound * qRound)) {
                System.out.println("k = " + k + ", q = " + q);
            }
        }
    }
}
