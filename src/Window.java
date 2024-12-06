import javax.swing.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Window {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Solitaire - Gecko");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);

		CustomPanel panel = new CustomPanel();
		frame.add(panel);

		frame.setVisible(true);

		class SheetBack {
			public static void main(String[] args) {
				try {
					BufferedImage SheetN = ImageIO.read(new File("assets/Card_Back-88x124.png"));
				} catch (IOException e) {
					e.printStackTrace();
                }
	}
}
