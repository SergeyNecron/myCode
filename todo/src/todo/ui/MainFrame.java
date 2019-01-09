package todo.ui;

import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainFrame extends JFrame {

	@Bean
	(initMethod = "init")
	public MainFrame maneFrame(
	@Value("#{mainPanel}")
	BoxLayoutPanel panel) {
		MainFrame frame = new MainFrame();
		frame.setContentPane(panel);
		frame.setTitle("Список заметок");
		return frame;
	}

	public void init() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new Dimension(800, 600));
        setState(Frame.MAXIMIZED_BOTH);
        setVisible(true);
	}
}