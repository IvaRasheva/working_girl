public class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(double a,double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    public double perimeter(){
        return a*b;
    }

    public double area(){
        return 2*a + 2*b;
    }
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
