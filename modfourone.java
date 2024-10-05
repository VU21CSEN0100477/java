public class modfourone {
    private double x;
    private double y;

    public modfourone(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(modfourone p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    public static void main(String[] args) {
        modfourone p1 = new modfourone(1.0, 2.0);
        modfourone p2 = new modfourone(4.0, 6.0);
    double distance = p1.distance(p2);
    System.out.println("Distance between p1 and p2: " + distance);
}
}