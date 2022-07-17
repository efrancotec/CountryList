package Data;

public class Country {

    private String name;

    private  double points;

    public Country(String name, double points) {
        this.name = name;
        this.points = points;
    }

    public Country() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }
}
