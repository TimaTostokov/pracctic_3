import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            Rectangle screenRectangle = new Rectangle(0, 0, 500, 500);

            BufferedImage screenshot = robot.createScreenCapture(screenRectangle);
            File outputFile = new File("screenshot.png");
            ImageIO.write(screenshot, "png", outputFile);

            System.out.println("Screenshot is saved in: " + outputFile);
        } catch (AWTException | IOException exception) {
            exception.printStackTrace();
        }
    }

}
