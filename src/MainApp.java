import com.company.Rectangle.Rectangle;
import processing.core.PApplet;

public class MainApp extends PApplet {

    Rectangle rectangle;
    Rectangle otherRec;

    public static void main(String[] args) {
        PApplet.main("MainApp", args);
    }

    public void settings() {
        size(800, 600);
    }

    public void draw() {
        background(126);
        rectangle.drawIt();
        otherRec.drawIt();
    }

    public void setup() {
        background(255);
        rectangle = new Rectangle(this, 1, 1);
        otherRec = new Rectangle(this, 50, 200);
    }
}
