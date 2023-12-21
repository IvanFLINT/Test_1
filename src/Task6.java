import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вещественное число с ненулевой дробной частью: ");
        double n = sc.nextDouble();
        int a = (int)n;
        System.out.println("Результат округления: " + a);
    }

}
