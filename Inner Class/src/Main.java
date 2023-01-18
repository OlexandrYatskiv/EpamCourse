public class Main {
    public static void main(String[] args) {
        Car porshe = new Car(248.3, "Red", "Porshe");

        Car.Motor motor1 = porshe.new Motor("disel",4.0);
        System.out.println(porshe.toString());
        System.out.println(motor1.toString());

    }
}