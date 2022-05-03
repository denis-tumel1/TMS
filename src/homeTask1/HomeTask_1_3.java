package homeTask1;//DONE
//Дано число. Положительное: +1, отрицательное: -2, нулевое: меняем на 10. Вывести значение.

import java.util.Scanner;

public class HomeTask_1_3 {
    public void homeTask_1_3() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int a = input.nextInt();
        input.close();
        int x = a + 1;
        int y = a - 2;
        int z = 10;
        if (a > 0) {
            System.out.println("Обновленное значение = " + x);
        } else if (a < 0) {
            System.out.println("Обновленное значение = " + y);
        } else {
            System.out.println("Обновленное значение = " + z);
        }
    }
}