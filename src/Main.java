public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int yearsOld = 17;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека равен " + yearsOld + " то ему нужно ходить в детский сад");
        } else if (yearsOld >= 7 && yearsOld <= 18) {
            System.out.println("Если возраст человека равен " + yearsOld + " то ему нужно ходить в школу");
        } else if (yearsOld > 18 && yearsOld <= 24) {
            System.out.println("Если возраст человека равен " + yearsOld + " то ему нужно ходить в университет");
        } else if (yearsOld > 24)
            System.out.println("Если возраст человека равен " + yearsOld + " то ему нужно ходить на работу");
    }}