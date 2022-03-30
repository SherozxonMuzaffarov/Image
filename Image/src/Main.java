import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main extends Frame {

	Image i;

	public Main() {
		try {
			File f = new File("C:\\Users\\TEMUR\\Desktop\\sh.png");
			i = ImageIO.read(f);
		} catch (IOException e1) {
			System.out.println("cannot read");
			System.exit(0);
		}

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(i, getInsets().left, getInsets().right, null);
	}

	public static void main(String[] args) {

		Main s = new Main();
		s.setSize(new Dimension(300, 220));

		s.setTitle("example");
		s.setVisible(true);

	}

}