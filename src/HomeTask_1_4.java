//DONE
//Даны 3 целых числа. Найти количество положительных чисел
import java.util.Scanner;
public class HomeTask_1_4 {
    public void homeTask_1_4 () {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите а");
        int a = input.nextInt();
        System.out.println("Введите b");
        int b = input.nextInt();
        System.out.println("Введите c");
        int c = input.nextInt();
        input.close();

        int a1;
        if (a > 0) {
            a1 = 1;
        } else a1 = 0;
        int b1;
        if (b > 0) {
            b1 = 1;
        } else b1 = 0;
        int c1;
        if (c > 0) {
            c1 = 1;
        } else c1 = 0;

        int result = a1 + b1 + c1;
        System.out.println("Количество положительных чисел - " + result);
    }
}