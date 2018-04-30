
public class Picture {

    private Drawable[] drawing = new Drawable[10];

    public void setDrawing(Drawable[] drawing) {
        this.drawing = drawing;
    }

    public Drawable[] getDrawing() {
        return drawing;
    }

    public void drawPicure(Shape shape, int x, int y, int fill, int colour) {
        System.out.print(shape.describeMe());
        shape.coordinates(x, y);
        shape.isFill(fill);
        shape.colour(colour);
    }
}
