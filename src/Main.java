public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,3);
        System.out.println(triangle);
        triangle.heigth = 2;
        System.out.println(triangle);
        Rectangle rectangle = new Rectangle(2,2);
        System.out.println(rectangle);
        Shape shape = new Triangle(3,3) ;
    }
}