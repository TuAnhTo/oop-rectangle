import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap vao chieu rong");
        double width = scanner.nextDouble();
        System.out.println("nhap vao chieu dai");
        double height = scanner.nextDouble();

        RectangleI rectangleI = new RectangleI();

        System.out.println(" dien tich cua hinh chu nhat la: " + rectangleI.getArea(width, height));
        System.out.println(" chu vi hinh chu nhat la: " + rectangleI.getPerimeter(width, height));
    }
}
