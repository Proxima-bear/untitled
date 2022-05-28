import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class glitch {
    static Scanner reader = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // task 10.4
//            System.out.println("Введите первый операнд");
//            int up = reader.nextInt();
//            System.out.println("Ведите второй операнд");
//            int down = reader.nextInt();
//            int a = down + (int)((up-down+1)*Math.random());
//            int b = down + (int)((up-down+1)*Math.random());
//            int c = down + (int)((up-down+1)*Math.random());
//            System.out.println(a);
//            System.out.println(b);
//            System.out.println(c); // to do 20 minutes


        // task 10.6
//            int down = random.nextInt(99-10);
//            int a = down + (int)((down+1)*Math.random());
//            int b = down + (int)((down+1)*Math.random());
//            int c = down + (int)((down+1)*Math.random());
//            if (a>99 || a<10) {
//                System.out.println("Ошибка");
//            }
//            if (b>99 || b<10){
//                System.out.println("error");
//            }
//            if (c>99 || c<10) {
//                System.out.println("Ошибка");
//            }
//            System.out.println(down);
//            System.out.println(a);
//            System.out.println(b);
//            System.out.println(c); // to do 26 minutes


        // task 10.8
//            int number = reader.nextInt();
//            int a = random.nextInt(11-1);
//            System.out.println(a);
//            if (number == a) {
//                System.out.println("Угадал)");
//            }
//            if (number < a) {
//                System.out.println("число слишком большое");
//            }
//            if (number > a) {
//                System.out.println("Число слишком маленькое");
//            }     // 12 minutes



        // task 10.15
//        int a, down = 250, up = 746;
//        a = down + (int) ((up - down + 1) * Math.random());
//        System.out.println(a);
//        int a1 = a / 100;
//        int a2 = (a / 10) % 10;
//        int a3 = a % 10;
//        if (a1 > a2 || a1 > a3) {
//            System.out.println(a1);
//        }
//        if (a2 > a3 || a2 > a1) {
//            System.out.println(a2);
//        }
//        if (a3 > a2 || a3 > a1) {
//            System.out.println(a3);
//        }
//        if (a1 < a2 || a1 < a3) {
//            System.out.println(a1);
//        }
//        if (a2 < a3 || a2 < a1) {
//            System.out.println(a2);
//        }
//        if (a3 < a2 || a3 < a1) {
//            System.out.println(a3);
//        }
//        if (a1 == a2 || a1 == a3) {
//            System.out.println("error");
//        }
//        if (a2==a3 || a2==a1) {
//            System.out.println("error");
//        }
//        if (a3==a2 || a3 == a1) {
//            System.out.println("error");
//        } // 1 hour
        // task 10.22
        int  down=-30, up=30;
        int x1 = down + (int) ((up - down + 1) * Math.random());
        int y1 = down + (int) ((up - down + 1) * Math.random());
        int x2 = down + (int) ((up - down + 1) * Math.random());
        int y2 = down + (int) ((up - down + 1) * Math.random());
        System.out.println(x1+","+y1+" --> "+x2+","+y2);
        double a = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1), 2));
        System.out.println((int)a);
        double gradus =Math.atan(1.0*(y2-y1)/(x2-x1));
        gradus = Math.toDegrees(gradus);
        System.out.println(gradus);
        if (x1 * x2 < 0) {
            System.out.println("X");
        }
        if (y1 * y2 < 0) {
            System.out.println("Y");
        }
        if (x1*x2>0 && y1*y2>0) {
            System.out.println("не пересекаются");
        }
    }
}







