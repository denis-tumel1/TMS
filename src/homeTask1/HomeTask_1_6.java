package homeTask1;//DONE
// Дано 2 числа. Вывести большее из них.

import java.util.Scanner;

public class HomeTask_1_6 {
    public void homeTask() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число 'a' ");
        int a = input.nextInt();
        System.out.println("Введите число 'b' ");
        int b = input.nextInt();
        input.close();
        if (a > b) {
            System.out.println("Число 'a' = " + a + " и больше числа 'b'");
        } else if (a < b) {
            System.out.println("Число 'b' = " + b + " и больше числа 'а'");
        } else {
            System.out.println("Значения равны");
        }
    }

}

