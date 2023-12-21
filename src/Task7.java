import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое натуральное число: ");
        int q = sc.nextInt();
        System.out.print("Введите второе натуральное число: ");
        int w = sc.nextInt();
        int resalt= q / w;
        int ostatok = q % w;
        System.out.println("Результат деления: " + resalt);
        System.out.println("Остаток от деления: " + ostatok);
    }
}
