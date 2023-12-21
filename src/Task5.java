import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int n = sc.nextInt();
        int ostatok=n%10;
        int celoe1=n/100;
        int celoe2 = (n/10)%10;

        System.out.println("Сумма цифр числа " + n +" = " + (ostatok + celoe1 + celoe2));
    }

}

