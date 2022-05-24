import org.omg.CORBA.WStringSeqHelper;

import javax.swing.*;
import java.util.Scanner;
public class Solution {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        // First task 9.10
//        System.out.println("Введите первый операнд");
//        int a = reader.nextInt();
//        System.out.println("Введите второй операнд");
//        int b = reader.nextInt();
//        System.out.println("Введите третий операнд");
//        int c = reader.nextInt();
//        if (a>b) {
//            System.out.println("Первый операнд больше второго");
//        }
//         if (a<b) {
//             System.out.println("Первый операнд меньше второго");
//         }
//         if (a == b) {
//             System.out.println("первый и второй операнд равны");
//         }
//         if (a>c) {
//             System.out.println("Первый операнд больше третьего ");
//         }
//         if ( a < c) {
//             System.out.println("Третий операнд больше первого");
//         }
//         if (a==c) {
//             System.out.println("первый и третий операнд равны");
//         }
//        if (b>c) {
//            System.out.println("второй операнд больше третьего");
//        }
//        if (b<c) {
//            System.out.println("третий операнд больше второго");
//        }
//        if (b==c) {
//            System.out.println("Второй и третий операнд равны");// time to do 23 minutes
//        }

          // task 9.11
//        int a = reader.nextInt();
////        int a1 = a/100;
////        int a2 = a%100/10;
////        int a3 = a%10;
////        if(a1 == a2 && a2 == a3)
////            System.out.println("число такое же плоское как твоя мамаша");
////        else
////            System.out.println("ошибка.Введите число повторно"); // time to do 7 minutes

        //task 9.23
//        System.out.println("Ведите число");
//        int a = reader.nextInt();
//        int a1 = a/100;
//        int a2 = a%100/10;
//        int a3 = a%10;
//        if((a1+a2+a3)%2==0 && a1*a2*a3%2==0)
//            System.out.println("число явлется дважды четным");
//        else
//            System.out.println("нихуя не явлется,иди поспи"); // time to do 12 minutes


        // Task 9.26
//        System.out.println("Введите четырех значное число");
//        int number4 = reader.nextInt();
//        System.out.println("Ведите двухзначное число");
//        int number2= reader.nextInt();
//        int a1 = number4/100;
//        int a2 = number4%100;
//        if (a1+number2<100 && a1 + number2>9 || a2+number2<100 && a2+number2>9) {
//            System.out.println("число является внутренним");
//        }
//        else
//            System.out.println("число не является внутренним"); // time to do 13 minutes
        // task 9.32
//        System.out.println("Введите год рожения сайгина");
//        int year = reader.nextInt();
//        if (year > 1999 || year < 1900)
//        {
//            System.out.println("false год не верный");
//        }
//
//        if ((year % 4 == 0) && year % 100 != 0)
//        {
//            System.out.println(year + " високосный год");
//        }
//        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
//        {
//            System.out.println(year + " високосный год");
//        }
//        else
//        {
//            System.out.println(year + " не високосный год"); // time to do 22 minutes
//        }
        //task 9.37 15:26
        System.out.println("Ведите имя и фамилию");
        String first = reader.nextLine();
        System.out.println("Ведите имя и фамилию");
        String second = reader.nextLine();
        int idx = first.lastIndexOf(' ');
        if (idx == -1)
            throw new IllegalArgumentException("Only a single name: " + first);
        String firstName = first.substring(0, idx);
        String lastName  = first.substring(idx + 1);
        int idx2 = first.lastIndexOf(' ');
        if (idx2 == -1)
            throw new IllegalArgumentException("Only a single name: " + second);
        String firstName2 = second.substring(0, idx);
        String lastName2  = second.substring(idx + 1);
        if(firstName.equals(firstName2)) {
            System.out.println("Тёзки, но не однофамильцы ");
        }
        if(lastName.equals(lastName2)) {
            System.out.println("однофамильцы, но не тёзки");
        }
        if(firstName.equals(firstName2) && lastName.equals(lastName2)) {
            System.out.println("и однофамильцы и тёзки");

        }
        else
            System.out.println("error");

        }

    }













