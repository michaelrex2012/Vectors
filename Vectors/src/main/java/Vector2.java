public class Vector2 {
    Point point1,point2;

    public Vector2(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Vector2 add(Vector2 add) {
        Point point1 = this.point1.add(add.point1);
        Point point2 = this.point2.add(add.point2);
        return new Vector2(point1, point2);
    }

    public Vector2 subtract(Vector2 subtract) {
        Point point1 = this.point1.add(new Point(-add.point1.x, -add.point1.y));
        Point point2 = this.point2.add(new Point(-add.point2.x, -add.point2.y));
        return new Vector2(point1, point2);
    }

    public double getMagitude() {
        
    }
}

