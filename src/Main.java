public class Main {
    public static void main(String[] args) {
         //Задание 3
        System.out.println("Задание 3");
        int one = 15;
        int two = 10;
        int free = 15;
        if (one > two) {
            if (one > free) {
                System.out.println("Максимальное число " + one);
            } else if (free > one) {
                System.out.println("Максимальное число " + free);
            } else {
                System.out.println("числа " + one + " и " + free + " равны");
            }
        } else if (two > one) {
            if (two > free) {
                System.out.println("Максимальное число " + two);
            } else if (free > two) {
                System.out.println("Максимальное число " + free);
            } else {
                System.out.println("числа " + two + " и " + free + " равны");
            }
        } else {
            if (one > free) {
                System.out.println("Максимальное число " + one);
            } else if (free > one) {
                System.out.println("Максимальное число " + free);
            } else {
                System.out.println("Все числа равны");
            }
        }
    }
}