//DONE

//В переменную записываем число и определяем положительное/отрицательное + вывод количества знаков в числе.
import java.util.Scanner;
public class HomeTask_1_1 {
    public void homeTask_1_1 () {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите любое число");
        int a = input.nextInt();
        input.close();
        System.out.println(checkPositive(a) + checkDepth(a));
    }

    public String checkPositive(int a) {
        if (a>0) return "Число " + a + " положительное. \n";
        else return "Число " + a + " отрицательное. \n";
    }

    public String checkDepth(int a) {
        int count=0;
        int b=a;
        while(a!=0) {
            count++;
            a%=10;
        }
        return "Число " + b + " является " + count + " значным";
        }
    }
