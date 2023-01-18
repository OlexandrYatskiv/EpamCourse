import java.lang.String;


public class Car {

    private double maxSpeed;
    private String color;
    private String model;
    public Car(){

    }
    public Car(double maxSpeed, String color, String model) {
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    class Motor{
        private String kindOfUsingEnergy;
        private double howUseEnergy;

        public String getKindOfUsingEnergy() {
            return kindOfUsingEnergy;
        }

        public void setKindOfUsingEnergy(String kindOfUsingEnergy) {
            this.kindOfUsingEnergy = kindOfUsingEnergy;
        }

        public double getHowUseEnergy() {
            return howUseEnergy;
        }

        public void setHowUseEnergy(double howUseEnergy) {
            this.howUseEnergy = howUseEnergy;

        }

        public Motor(String kindOfUsingEnergy, double howUseEnergy) {
            this.kindOfUsingEnergy = kindOfUsingEnergy;
            this.howUseEnergy = howUseEnergy;
        }

        public Motor() {
        }

        @Override
        public String toString() {
            return "Motor{" +
                    "kindOfUsingEnergy='" + kindOfUsingEnergy + '\'' +
                    ", howUseEnergy=" + howUseEnergy +
                    '}';
        }
    }
}
