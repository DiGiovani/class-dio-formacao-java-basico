package aulas.oo.part01.paradigma.exemplo001.exercise;

public class AplicandoClasseCar {
    public static void main(String[] args) {
        int capability = 5;

        Car car = new Car();
        car.setCapability(capability);

        for(int i = 0; i < capability; i++) {
            System.out.println(car.incAmount());
        }

        for(int i = 0; i < capability; i++) {
            System.out.println(car.decAmount());
        }
    }
}
