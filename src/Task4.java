import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите двузначное число: ");
        int n = sc.nextInt();
        int ostatok=n%10;
        int celoe=n/10;
        System.out.println("Сумма цифр числа " + n +" = " + (ostatok + celoe));
    }

    }

