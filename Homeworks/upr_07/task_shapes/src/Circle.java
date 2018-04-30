public class Circle extends Shape{

    private final static double pi = Math.PI;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    public double perimeter(){
        return 2*radius*pi;
    }

    public double area(){
        return Math.pow(radius,radius)*pi;
    }
//
//    @Override
//    public String describeMe() {
//        return super.describeMe();
//    }

    @Override
    public void coordinates(int x, int y) {
        System.out.printf("My coordinates are %d and %d. %n", x, y);
    }

    @Override
    public void isFill(int b) {
        boolean fill = setFill(b);
        System.out.printf("I am 100 percents %s. %n", fill ? "fill" : "not fill");
    }

    @Override
    public void colour(int c) {
        System.out.printf("My colour is %d", c);
    }


    @Override
    public boolean setFill(int b) {
        return (b == 1);
    }

}
