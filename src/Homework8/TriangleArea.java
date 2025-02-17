package Homework8;

public class TriangleArea {
    public static double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        return area;
    }

    public static void main(String[] args) {
        double a = 8;
        double b = 10;
        double c = 12;

        double area = calculateArea(a, b, c);

        System.out.println("Triangle area is: " + area);
    }
}