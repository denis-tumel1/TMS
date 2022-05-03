package homeTask1;//Даны 3 целых числа. Найти количество положительных и отрицательных чисел

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HomeTask_1_5 {
    int count = 0;
    int count2 = 0;
    public void homeTask_1_5() {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите а");
        a = input.nextInt();
        count (a);
        System.out.println("Введите b");
        a = input.nextInt();
        count (a);
        System.out.println("Введите c");
        a = input.nextInt();
        count (a);
        System.out.println("Отрицательных чисел - " + count2 + " Положительных чисел - " + count);
        input.close();
    }
    public int count(int a) {   // счетчик возвращает число
        if (a > 0) {
            return count++;
        } else {
            return count2++;
        }
        //return System.out.println("Нечетных чисел " + count2 + "Четных чисел " + count);
    }
}