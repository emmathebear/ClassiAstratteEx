package shapes;

import shapes.Shape;

public class Triangle extends Shape {
    public Triangle(int heigth, int base) {
        super(heigth, base);
    }

    @Override
    public int calculateArea() {
        return base * heigth / 2;
    }

}
