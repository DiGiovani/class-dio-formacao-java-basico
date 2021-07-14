package aulas.oo.part02.construtores.exercise;

public class CarExemple {
    public static void main(String[] args) {
        Car myCar = new Car("Fiat", "Sienna", 2013, "Attractive");

        System.out.println(myCar.specs());
    }
}
