package maxim;


public class Rectangle {

    private double x;
    private double y;
    private static int createdRectangles;
    private final static String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private final static String ENGLISH_CLASS_NAME = "Rectangle";

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
        createdRectangles++;

    }


    public Rectangle(double x) {
        this.x = x;
        this.y = x;
        createdRectangles++;
    }


    public double calculateArea() {
        double area = x * y;
        return area;

    }


    public void printArea() {
        System.out.print("Площадь фигуры: " + calculateArea());
    }


    public void printRectangleKind() {
        if (x == y) {
            System.out.print("; Это квадрат;");
        } else System.out.print("; Это прямоугольник;");
    }



    public boolean isTheSameRectangle(Rectangle rectangle) {
        return this.x == rectangle.x && this.y == rectangle.y;
    }



    public static void printRectanglesCount() {
        System.out.println("Всего было создано [" + Rectangle.createdRectangles + "] прямоугольников");
    }


    static boolean printClassName(boolean printInRussian) {
        if (printInRussian) {
            System.out.println("Имя класса: " + RUSSIAN_CLASS_NAME);}
        else System.out.println("Имя класса: " +  ENGLISH_CLASS_NAME);
        return printInRussian;


    }


}

