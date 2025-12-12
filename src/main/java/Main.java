import java.util.Scanner;

public class Main {
    private static final int maxSpeed = 250;
    private static final int minSpeed = 0;

    public static void main(String[] args)
    {
        int carsCount = 3;
        final Car[] cars = new Car[carsCount];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= carsCount-1; i++) {
            cars[i] = carGenerator(i, scanner);
        }

        for (int i = 0; i <= carsCount - 1; i++) {
            System.out.println(cars[i].name + " " + cars[i].speed);
        }

        String fastestCar = Race.fastestCar(cars);
        System.out.printf("Самая быстрая машина: %s", fastestCar);
    }

    private static Car carGenerator(int i, Scanner scanner) {
        String name = carNamer(i, scanner);
        int speed = carSpeeder(i, scanner);

        return new Car(name, speed);
    }

    private static String carNamer(int i, Scanner scanner) {
        System.out.printf("Введите название машины №%d: ", i + 1);
        return scanner.next();
    }

    private static int carSpeeder(int i, Scanner scanner) {
        String speedString;
        int speed;

        while (true) {
            System.out.printf("Введите скорость машины №%d: ", i + 1);

            speedString = scanner.next();

            if (speedString.matches("\\d+")) {
                speed = Integer.parseInt(speedString);
                if (speed > minSpeed && speed <= maxSpeed) {
                    return speed;
                }
                else
                    System.out.printf("Неверная скорость машины! Скорость должна быть между %d и %d.\n", minSpeed, maxSpeed);
            }
            else
                System.out.println("Неверная скорость машины! Скорость должна состоять из цифр.");
        }
    }
}