package shapes;

import shapes.Shape;

public class Rectangle extends Shape {
    public Rectangle(int heigth, int base) {
        super(heigth, base);
    }

    @Override
    public int calculateArea() {
        return base * heigth;
    }

}
