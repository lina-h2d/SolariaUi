
import javax.swing.*;
import java.net.URL;

public class iconography {

    private static final String ICON_PATH = "/Assets/icons/";

    private iconography() {
        // Prevent instantiation
    }

    private static Icon load(String filename) {
        URL resource = CustomIcons.class.getResource(ICON_PATH + filename);
        if (resource != null) {
            return new ImageIcon(resource);
        } else {
            System.err.println("Icon not found: " + ICON_PATH + filename);
            return null;
        }
    }

    public static Icon imageUpload() {
        return load("image-upload.png");
    }

    public static Icon image() {
        return load("image.png");
    }

    public static Icon imageStack() {
        return load("image-stack.png");
    }

    public static Icon download() {
        return load("download.png");
    }

    public static Icon books() {
        return load("books.png");
    }

    public static Icon chart() {
        return load("chart.png");
    }

    public static Icon help() {
        return load("help.png");
    }

    public static Icon function() {
        return load("function.png");
    }

    public static Icon joystick() {
        return load("joystick.png");
    }

    public static Icon mail() {
        return load("mail.png");
    }

    public static Icon mute() {
        return load("mute.png");
    }

    public static Icon location() {
        return load("location.png");
    }
}

