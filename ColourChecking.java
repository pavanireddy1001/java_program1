import java.awt.Color;

public class ColourChecking {
    public static void main(String[] args) {
         int red = 193;
        int green = 255;
        int blue = 183;

        
        Color color = new Color(red, green, blue);

        float[] hsb = Color.RGBtoHSB(red, green, blue, null);
        float hue = hsb[0];
        float saturation = hsb[1];
        float brightness = hsb[2];

        System.out.println("Hue: " + hue);
        System.out.println("Saturation: " + saturation);
        System.out.println("Brightness: " + brightness);
    }
}