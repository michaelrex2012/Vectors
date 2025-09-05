public class Vector2 {
    Point point1,point2;

    public Vector2(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Vector2 add(Vector2 add) {
        point1 = this.point1.add(add.point1);
        point2 = this.point2.add(add.point2);
        return new Vector2(point1, point2);
    }

    public Vector2 subtract(Vector2)
}
