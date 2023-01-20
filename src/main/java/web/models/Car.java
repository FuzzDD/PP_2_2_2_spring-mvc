package web.models;

public class Car {
    private int vin;
    private String model;
    private int year;

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(int vin, String model, int year) {
        this.vin = vin;
        this.model = model;
        this.year = year;

    }

    @Override
    public String toString() {
        return "Car{" +
                "vin=" + vin +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
