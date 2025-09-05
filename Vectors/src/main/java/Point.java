public class Point {
    double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point add(Point point1) {
        x = this.x + point1.x;
        y = this.x + point1.y;
        return new Point(x, y);
    }
}
