import java.util.Scanner;

public class PictureMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Picture pic = new Picture();

        System.out.println("Print enter your figure name: ");

        mainLoop:
        while (true) {

            String figure = sc.next().toLowerCase();
            switch (figure) {
                case "rectangle":
                    pic.setDrawing(new Drawable[]{new Rectangle(sc.nextDouble(), sc.nextDouble())});
                    break;
                case "circle":
                    pic.setDrawing(new Drawable[]{new Circle(sc.nextDouble())});
                    break;
                case "square":
                    pic.setDrawing(new Drawable[]{new Square(sc.nextDouble())});
                    break;
                default:
                    System.out.println("Incorrect figure!");
                    break mainLoop;
            }

            for (Drawable drawable : pic.getDrawing()) {
                System.out.println("Please enter coordinates for x and y, is it fill (yes = 1, no = 0) and colour: ");
                pic.drawPicure((Shape) drawable, sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            }

        }
    }
}
