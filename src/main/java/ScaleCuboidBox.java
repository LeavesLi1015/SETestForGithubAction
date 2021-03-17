public class ScaleCuboidBox {
    private double length;
    private double width;
    private double height;

    public ScaleCuboidBox(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    public void setLength(double l) {
        length = l;
    }

    public void setWidth(double w) {
        width = w;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return length * width * height;
    }
}
