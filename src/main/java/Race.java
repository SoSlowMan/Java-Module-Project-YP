public class Race {
    // Func that gets array of cars and decides which one is the fastest then returns the name of it
    public static String FastestCar(Car[] cars) {
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
