import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
             System.out.println("Вычесление выражения a = 4*(b+c-1)/2");

        System.out.println("Введите значение переменной b");
        int b = sc.nextInt();
        System.out.println("Введите значение переменной c");
        int c = sc.nextInt();

        int a = 4*(b+c-1)/2;
        System.out.println("Результат выражения: " + a);
    }
}
