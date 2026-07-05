public class DrinkCoffee {

    void drinkCoffee(Coffee coffee) throws TemperatureException, ConcetrationException {
        if (coffee.getTemp() > 65) {
            throw new TemperatureException(coffee.getTemp(), "Cafeaua e prea fierbinte. O aruncam!");
        } else {
            System.out.println("t: " + coffee.getTemp());
        }

        if (coffee.getConc() > 55) {
            throw new ConcetrationException(coffee.getConc(), "Concentratie mare. O aruncam!");
        } else {
            System.out.println("c: " + coffee.getConc());
        }
    }
}
