import java.util.Scanner;
import java.awt.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        // Inside main()
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        int width = input.nextInt();
        System.out.print("Enter height: ");
        int height = input.nextInt();
        // og code
        Rectangle box1 = new Rectangle(10, 10, 40, 30);
        Rectangle box2 = new Rectangle(10, 10, width, height);

        System.out.println("box1: " + box1);
        System.out.println("box2:" + box2);

    }
}
