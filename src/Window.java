import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Solitaire - Gecko");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);

		CustomPanel panel = new CustomPanel();
		frame.add(panel);

		frame.setVisible(true);
	}
}
