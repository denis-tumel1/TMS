package homeTask1;//DONE

//Треугольник существует когда сумма 2-х сторон больше 3-й. Дано a,b,c - стороны.
// Сравнить длину каждого отрезка с суммой двух других.
// Если хотя бы в одном случае отрезок окажется больше суммы двух других, то треугольника не существует.

import java.util.Scanner;

public class HomeTask_1_2 {
    public void homeTask_1_2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сторону 'a' треугольника");
        int a = input.nextInt();
        System.out.println("Введите сторону 'b' треугольника");
        int b = input.nextInt();
        System.out.println("Введите сторону 'c' треугольника");
        int c = input.nextInt();
        input.close();
        boolean x1 = a + b > c;
        boolean x2 = a + c > b;
        boolean x3 = b + c > a;
        if (x1 == x2 == x3) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}


//Операторы & и &&

//x=n>1?0:1;
//Переменной x будет присвоено значение 0, если n>1 (выражение n>1 имеет значение true)
// или 1, если n≤1 (выражение n>1 имеет значение false).

