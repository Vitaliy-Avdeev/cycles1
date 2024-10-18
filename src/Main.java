public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Привет мир!");

        var taskOne = ("Задача №1");
        System.out.println(taskOne);
        for (int i = 0; i <= 10; i++) {
            System.out.println("" + i);
        }

        var taskTwo = ("Задача №2");
        System.out.println(taskTwo);
        for (int u = 10; u >= 0; u--) {
            System.out.println("" + u);
        }

        var taskThree = ("Задача №3");
        System.out.println(taskThree);
        for (int f = 0; f <= 17; f = f + 2) {
            System.out.println("" + f);
        }
        var taskFour = ("Задача №4");
        System.out.println(taskFour);
        for (int v = 10; v >= -10; v--) {
            System.out.println("" + v);
        }

        var taskFive = ("Задача №5");
        System.out.println(taskFive);
        for (int w = 1904; w <= 2096; w = w + 4) {
            System.out.println(w + " год является високосным.");
        }

        var taskSix = ("Задача №6");
        System.out.println(taskSix);
        for (int e = 7; e <= 98; e = e + 7) {
            System.out.println("" + e);
        }

        var taskSeven = ("Задача №7");
        System.out.println(taskSeven);
        for (int x = 1; x <= 512; x = x * 2) {
            System.out.println("" + x);
        }
        var taskEight = ("Задача №8");
        System.out.println(taskEight);
        int savings = 29000;
        int total = 0;
        for (int m = 1; m <= 12; m++) {
            total = total + savings;
            System.out.println("Месяц " + m + ", сумма накопления равна " + total + " рублей.");
        }

        var taskNine = ("Задача №9");
        System.out.println(taskNine);
        double totalTotal = 0;
        for (int m = 1; m <= 12; m++) {
            totalTotal = totalTotal + totalTotal / 100;
            totalTotal = totalTotal + savings;
            String totalTotalResult = String.format("%.2f",totalTotal);
            System.out.println("Месяц " + m +", сумма накопления равна " + totalTotalResult + " рублей.");
        }

        var taskTen = ("Задача №10");
        System.out.println(taskTen);
        int c = 2;
        for (int r = 1; r <= 10; ++r) {
            System.out.println(c + " * " + r + " = " + c * r);
        }

    }
}



