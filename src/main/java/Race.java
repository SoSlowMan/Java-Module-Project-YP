public class Race {
    public static String fastestCar(Car[] cars) {
        String fastestName = "";
        int maxSpeed = 0;

        for (int i = 0; i <= cars.length - 1; i++) {
            if (cars[i].speed > maxSpeed)
            {
                fastestName = cars[i].name;
                maxSpeed = cars[i].speed;
            }
        }
        return fastestName;
    }
}
