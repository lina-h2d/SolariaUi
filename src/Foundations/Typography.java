package src.Foundations;
import java.awt.*;

public class Typography {

    public static final String BASE_FONT = "Segoe UI";
    public static final String MODERN_FONT = "Gabarito";
    public static final String DISPLAY_FONT = "Fugaz One";
    public static final String PIXEL_FONT = "Pixelify Sans";

  
    public static final Font DISPLAY_XL = new Font(DISPLAY_FONT, Font.BOLD, 32);
    public static final Font DISPLAY_L = new Font(DISPLAY_FONT, Font.BOLD, 24);
    public static final Font HEADING_M = new Font(MODERN_FONT, Font.BOLD, 20);
    public static final Font HEADING_S = new Font(MODERN_FONT, Font.BOLD, 18);
    public static final Font BODY = new Font(BASE_FONT, Font.PLAIN, 16);
    public static final Font BODY_SMALL = new Font(BASE_FONT, Font.PLAIN, 14);
    public static final Font CAPTION = new Font(BASE_FONT, Font.PLAIN, 12);

    private Typography() {
       
    }
}
