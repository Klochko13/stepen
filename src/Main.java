import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Введите число");
        int num = key.nextInt();
        System.out.println("Введите стпень");
        int step = key.nextInt();
        int result = 1;
        for (int i = 0; i < step; i++) {
            result = result * num;
        }
        System.out.println(result);
    }
}