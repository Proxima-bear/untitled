import javax.swing.*;
import java.util.Scanner;

public class Solution {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

//        int x = reader.nextInt(); //14:27 задание первое 8.5
//        if (x>0)
//            System.out.println("Плюс");
//        else
//            System.out.println("не плюс"); // 1/5


//        System.out.println("Введите первый операнд");
//        int x = reader.nextInt();
//        System.out.println("Введите второй операнд");
//        int a = reader.nextInt();
//        if (x>a) {
//            a = -1;
//        }
//        else
//            a = 0;
//        System.out.println(a); // 2/5


//
//        int a = reader.nextInt();
//        if (a>100)
//            System.out.println("true numeric");
//        else
//            System.out.println("error"); // 3/5


//        System.out.println("enter the first operand");
//        int x = reader.nextInt();
//        System.out.println("enter the second operand");
//        int a = reader.nextInt();
//        if (x != a ) {
//            a = x;
//        }
//        else
//            x = a*2;
//        System.out.println(x); // 4/5


//        int x = reader.nextInt();
//        if (x > 0) {
//            x = x + 1;
//            System.out.println(x);
//        }
//        else
//            x = x -1;
//        System.out.println(x); // the end of the first task


        // the task number 8.11 time 15:04
//        System.out.println("enter amount of students");
//        int a = reader.nextInt();
//        System.out.println("enter amount if chairs");
//        int b = reader.nextInt();
//        if (a>b) {
//            a = a - b;
//            System.out.println(a);
//            System.out.println("стульев не хватает");
//        }
//        if (a<b) {
//            b = b - a;
//            System.out.println(b);
//            System.out.println("дима лох, а стульев многовато");
//        }
//        if (a==b)
//            System.out.println("всего хватает, а дмитрий смотрит хентай)"); // the end of the task 8.11 time 15:38


        // task 8.12 time 15:42
//        int a = reader.nextInt();
//        if (a < 1 || a > 5) {
//            System.out.println("error:404 иди учись добоебина Ёбаная ");
//        }
//        else {
//            System.out.println("мужчина");
//        }                                     // the end of the task 8.12


        // task 8.14 time 15:58
//        int a = reader.nextInt();
//        int b = a/10;
//        int c = a%10;
//        if (b > c)
//            System.out.println(true); // the end of the task 16:02
        // task 8.31 time 16:09
        int a = reader.nextInt();
        int b = a / 100;
        int c = a%100/10;
        int d = a%10;
        if (b%2 == 0)
            b = b + 1;
            else
                b = b - 1;
            if (c%2 == 0)
                c = c + 1;
          else
                c = c - 1;
            if (d%2 == 0)
                d = d + 1;
            else
                d = d - 1;
        System.out.println(b * 100 + c*100/10 + d); // task 8.31 complete time 17:40


    }
}












