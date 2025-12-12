import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean isSpeedRight;
        int carsCount = 3, maxSpeed = 250, minSpeed = 0;
        Car[] cars = new Car[carsCount];

        for (int i = 0; i <= carsCount-1; i++) {
            int speed = -1;
            String speedString;
            isSpeedRight = false;
            System.out.printf("Введите название машины №%d: ", i + 1);
            String name = scanner.next();
            while (!isSpeedRight) {
                System.out.printf("Введите скорость машины №%d: ", i + 1);
                speedString = scanner.next();
                if (speedString.matches("\\d+")) {
                    speed = Integer.parseInt(speedString);
                    if (speed > minSpeed && speed <= maxSpeed) {
                        isSpeedRight = true;
                    }
                    else
                        System.out.printf("Неверная скорость машины! Скорость должна быть между %d и %d.\n", minSpeed, maxSpeed);
                }
                else
                    System.out.println("Неверная скорость машины! Скорость должна состоять из цифр.");

            }
            cars[i] = new Car(name, speed);
        }

        for (int i = 0; i <= carsCount - 1; i++) {
            System.out.println(cars[i].name + " " + cars[i].speed);
        }

        String fastestCar = Race.FastestCar(cars);
        System.out.printf("Самая быстрая машина: %s", fastestCar);
    }
}