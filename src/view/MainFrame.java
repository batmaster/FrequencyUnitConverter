package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.xml.bind.JAXBException;

import controller.FrequencyUnitConverterController;
import net.webservicex.Frequencys;


public class MainFrame extends JFrame {
	
	private JPanel mainPanel;
	private JPanel topPanel;
	private JTextField valueTextField;
	private JButton convertButton;
	private JPanel middlePanel;
	private JComboBox<Frequencys> fromCombobox;
	private JComboBox<Frequencys> toCombobox;
	private JPanel bottomPanel;
	private JTextField resultTextField;
	private JLabel statusLabel;
	
	private FrequencyUnitConverterController controller;
	
	
	public MainFrame() {
		super("Frequency Unit Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(450, 180));
		setResizable(false);
		
		initComponents();
	}

	private void initComponents() {
		setLayout(new FlowLayout());
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		/* Top Panel */
		topPanel = new JPanel(new FlowLayout());
		
		valueTextField = new JTextField(27);
		valueTextField.setText("100");
		valueTextField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) { }
			
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					convert();
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) { }
		});
		topPanel.add(valueTextField);
		
		convertButton = new JButton("Convert");
		convertButton.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				convert();
			}
			
			@Override
			public void mousePressed(MouseEvent e) { }
			
			@Override
			public void mouseExited(MouseEvent e) { }
			
			@Override
			public void mouseEntered(MouseEvent e) { }
			
			@Override
			public void mouseClicked(MouseEvent e) { }
		});
		topPanel.add(convertButton);
		
		mainPanel.add(topPanel);
		
		/* Middle Panel */
		middlePanel = new JPanel();
		
		fromCombobox = new JComboBox<Frequencys>(Frequencys.values());
		middlePanel.add(fromCombobox);
		
		toCombobox = new JComboBox<Frequencys>(Frequencys.values());
		middlePanel.add(toCombobox);
		
		mainPanel.add(middlePanel);
		
		/* Bottom Panel */
		bottomPanel = new JPanel(new FlowLayout());
		
		resultTextField = new JTextField("Result");
		resultTextField.setEditable(false);
		resultTextField.setPreferredSize(new Dimension((int) this.getPreferredSize().getWidth() - 10, 25));
		
		bottomPanel.add(resultTextField);
		
		mainPanel.add(bottomPanel);
		
		/* Status Panel */
		statusLabel = new JLabel("Connecting...");
		statusLabel.setPreferredSize(new Dimension((int) this.getPreferredSize().getWidth() - 10, 25));
		
		mainPanel.add(statusLabel);
		
		this.add(mainPanel);
	}
	
	public void run() {
		pack();
		setVisible(true);
	}
	
	public void setController(FrequencyUnitConverterController controller) {
		this.controller = controller;
	}
	
	public void showResult(String result) {
		resultTextField.setText(result);
	}
	
	public void showStatus(String status) {
		statusLabel.setText(status);
	}

	private void convert() {
		double value = Double.parseDouble(valueTextField.getText().toString());
		Frequencys from = (Frequencys) fromCombobox.getSelectedItem();
		Frequencys to = (Frequencys) toCombobox.getSelectedItem();
		
		controller.setParameters(value, from, to);
		controller.execute();
	}
}
