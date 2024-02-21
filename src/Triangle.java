public class Triangle extends Shape {
    public Triangle(int heigth, int base) {
        super(heigth, base);
    }


    public String toString() {
        return "Triangle{" +
                "heigth=" + heigth +
                ", base=" + base +
                ", calculateArea=" + calculateArea() +
                "} ";
    }

    public int calculateArea() {
        return base * heigth / 2;
    }

}
