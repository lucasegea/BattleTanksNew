package view;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Window extends JFrame {
	public KeyEvent key;
	JTextField textField = new JTextField();

	public Window() {
		setSize(50, 50);
		putTextField(this);
	}

	public void putTextField(Window window) {
		textField.setBounds(20, 30, 30, 30);
		window.add(textField);
		// KeyEvents(textField);
	}

	public JTextField getTextField() {
		return textField;

	}

	public KeyEvent getKeyEvents() {
		return key;
	}
}