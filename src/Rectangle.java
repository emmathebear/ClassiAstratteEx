public class Rectangle extends Shape {
    public Rectangle(int heigth, int base) {
        super(heigth, base);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "heigth=" + heigth +
                ", base=" + base +
                ", calculateArea=" + calculateArea() +
                "} ";
    }

    public int calculateArea() {
        return base * heigth;
    }

}
