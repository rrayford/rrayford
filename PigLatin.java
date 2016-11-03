import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

import javax.swing.*;

public class PigLatin extends JFrame implements ActionListener {

	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;
	public static final String TRANSLATE = "Translate";
	private JTextArea text;
	private JTextArea translatedText;
	private String textInPigLatin = "";
	
	
	public PigLatin(){
		super("Pig Latin");
		this.setSize(WIDTH, HEIGHT);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		text = new JTextArea(20,20);
		translatedText = new JTextArea(20,20);
		
		this.add(text);
		this.add(translatedText);
		
		JButton TRANSLATEBUTTON = new JButton(TRANSLATE);
		
		this.add(TRANSLATEBUTTON);
		TRANSLATEBUTTON.addActionListener(this);
	}

	@Override

	public void actionPerformed(ActionEvent e) {
		String buttonText = e.getActionCommand();
		
		if(buttonText.equals(TRANSLATE)){
			Scanner keyboard = new Scanner(this.text.getText());
			while(keyboard.hasNext()){
				String letter = keyboard.next();
				letter.toLowerCase();
				if(letter.substring(0,1).equals('a')||letter.substring(0,1).equals('e')||letter.substring(0,1).equals('i')
						||letter.substring(0,1).equals('o')||letter.substring(0,1).equals('u')){
					textInPigLatin = letter+"way";
					
				}else{
				String last  = letter.substring(0,1);
				textInPigLatin = letter.substring(1) + last + "ay";
				
				}
			}this.translatedText.setText(textInPigLatin);
			keyboard.close();
		}
		
	}
	public static void main(String[] args) {
		PigLatin pigLatin = new PigLatin();
		pigLatin.setVisible(true);

	}

}
