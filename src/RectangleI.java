public class RectangleI implements repository {


    @Override
    public double getArea(double width, double height) {
        return width * height;
    }

    @Override
    public double getPerimeter(double width, double height) {
        return (width + height) * 2;
    }

    @Override
    public String display() {
        return null;
    }
}
