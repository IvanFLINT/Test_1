import java.util.Scanner;

public class Task8 {

     public static void main(String[] args){

            Scanner sr = new Scanner(System.in);
            System.out.print("Введите число a: ");
            int a = sr.nextInt();
            System.out.print("Введите число b: ");
            int b = sr.nextInt();
            int c = a;
                a = b;
                b = c;
            System.out.println("Пееменная a после заменя: " + a);
            System.out.println("Пееменная b после заменя: " + b);
     }
}
