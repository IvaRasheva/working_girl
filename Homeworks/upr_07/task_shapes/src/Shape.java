public abstract class Shape implements Drawable {

    public abstract String getName();

    public double perimeter(){
        return 0;
    }

    public double area(){
        return 0;
    }

    public String describeMe() {
        return String.format("My name is %s, my area is %.2f, and my perimeter is %.2f. %n", getName(), area(), perimeter());
    }

}
