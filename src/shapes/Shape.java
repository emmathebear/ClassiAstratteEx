package shapes;

public abstract class Shape {
    protected int heigth, base;

    public Shape(int heigth, int base) {
        this.heigth = heigth;
        this.base = base;
    }

    public String toString() {
        return "shapes{" +
                "heigth=" + heigth +
                ", base=" + base +
                ", calculateArea=" + calculateArea() +
                "} ";
    }


    public abstract int calculateArea();
}
