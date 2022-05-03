package homeTask1;

import java.util.Scanner;
public class TaskOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите а");
        double a = input.nextDouble();
        System.out.println("Введите b");
        double b = input.nextDouble();
        System.out.println("Введите c");
        double c = input.nextDouble();
        input.close();
        double resultOne = (((a - 3) * b / 2) + c);
        System.out.println("Функция = " + resultOne);
    }
}
