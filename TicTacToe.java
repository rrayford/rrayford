import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TicTacToe extends JFrame implements ActionListener {

	private static final int WIDTH = 500;
	private static final int HEIGHT = 500;
	JLabel messages;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	
	public TicTacToe(){
		super();
		this.setSize(WIDTH, HEIGHT);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		JPanel gamePanel = new JPanel();
		gamePanel.setLayout(new GridLayout(3,3));
		this.add(gamePanel, BorderLayout.CENTER);
		
		messages = new JLabel("Start Game");
		this.add(messages, BorderLayout.NORTH);
		
		button1 = new JButton();
		gamePanel.add(button1);
		button1.addActionListener(this);
		button2 = new JButton();
		gamePanel.add(button2);
		button2.addActionListener(this);
		button3 = new JButton();
		gamePanel.add(button3);
		button3.addActionListener(this);
		button4 = new JButton();
		gamePanel.add(button4);
		button4.addActionListener(this);
		button5 = new JButton();
		gamePanel.add(button5);
		button5.addActionListener(this);
		button6 = new JButton();
		gamePanel.add(button6);
		button6.addActionListener(this);
		button7 = new JButton();
		gamePanel.add(button7);
		button7.addActionListener(this);
		button8 = new JButton();
		gamePanel.add(button8);
		button8.addActionListener(this);
		button9 = new JButton();
		gamePanel.add(button9);
		button9.addActionListener(this);
		
		JButton reset = new JButton("RESET");
		this.add(reset, BorderLayout.SOUTH);
		reset.addActionListener(this);
	}
	
	public static void main(String[] args) {

		TicTacToe game = new TicTacToe();
		game.setVisible(true);

	}
	public void clearBoard(){
		button1.setText(" ");
		button2.setText(" ");
		button3.setText(" ");
		button4.setText(" ");
		button5.setText(" ");
		button6.setText(" ");
		button7.setText(" ");
		button8.setText(" ");
		button9.setText(" ");
		messages.setText("Start Game");
	}
	public void checkWin(){
		//across top
		if(button1.getText().equals("X")&&button2.getText().equals("X")&&button3.getText().equals("X")){
			messages.setText("Player X Wins");
		}else if(button1.getText().equals("O")&&button2.getText().equals("O")&&button3.getText().equals("O")){
			messages.setText("Player O Wins");
		}
		//across middle
		if(button4.getText().equals("X")&&button5.getText().equals("X")&&button5.getText().equals("X")){
			messages.setText("Player O Wins");
		}else if(button4.getText().equals("O")&&button5.getText().equals("O")&&button6.getText().equals("O")){
			messages.setText("Player O Wins");
		}
		//across bottom
		if(button7.getText().equals("X")&&button8.getText().equals("X")&&button9.getText().equals("X")){
			messages.setText("Player X Wins");
		}else if(button7.getText().equals("O")&&button8.getText().equals("O")&&button9.getText().equals("O")){
			messages.setText("Player O Wins");
		}
		//down left
		if(button1.getText().equals("X")&&button4.getText().equals("X")&&button7.getText().equals("X")){
			messages.setText("Player X Wins");
		}else if(button1.getText().equals("O")&&button4.getText().equals("O")&&button7.getText().equals("O")){
			messages.setText("Player O Wins");
		}
		//down center
		if(button2.getText().equals("X")&&button5.getText().equals("X")&&button8.getText().equals("X")){
			messages.setText("Player X Wins");
		}else if(button2.getText().equals("O")&&button5.getText().equals("O")&&button8.getText().equals("O")){
			messages.setText("Player O Wins");
		}
		//down right
		if(button3.getText().equals("X")&&button6.getText().equals("X")&&button9.getText().equals("X")){
			messages.setText("Player X Wins");
		}else if(button3.getText().equals("O")&&button6.getText().equals("O")&&button9.getText().equals("O")){
			messages.setText("Player O Wins");
		}
		//diagnol negative
		if(button1.getText().equals("X")&&button5.getText().equals("X")&&button9.getText().equals("X")){
			messages.setText("Player X Wins");
		}else if(button1.getText().equals("O")&&button5.getText().equals("O")&&button9.getText().equals("O")){
			messages.setText("Player O Wins");
		}
		//diagnol positive
		if(button3.getText().equals("X")&&button5.getText().equals("X")&&button7.getText().equals("X")){
			messages.setText("Player X Wins");
		}else if(button3.getText().equals("O")&&button5.getText().equals("O")&&button7.getText().equals("O")){
			messages.setText("Player O Wins");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if(button.equals("RESET")){
			clearBoard();
		}
		int moveCounter = 0;
		if((moveCounter/2)*2==moveCounter){
			if(e.getSource()==button1){
				button1.setText("X");
				moveCounter++;
				checkWin();
			}
			else if(e.getSource()==button2){
				button2.setText("X");
				moveCounter++;
				checkWin();
			}
			else if(e.getSource()==button3){
				button3.setText("X");
				moveCounter++;
				checkWin();
			}
			if(e.getSource()==button4){
				button4.setText("X");
				moveCounter++;
				checkWin();
			}
			else if(e.getSource()==button5){
				button5.setText("X");
				moveCounter++;
				checkWin();
			}
			else if(e.getSource()==button6){
				button6.setText("X");
				moveCounter++;
				checkWin();
			}
			else if(e.getSource()==button7){
				button7.setText("X");
				moveCounter++;
				checkWin();
			}
			else if(e.getSource()==button8){
				button8.setText("X");
				moveCounter++;
				checkWin();
			}
			else if(e.getSource()==button9){
				button9.setText("X");
				moveCounter++;
				checkWin();
			}
		}
		else{			
			if(e.getSource()==button1){
				button1.setText("O");
				moveCounter++;
				checkWin();
			}
			else if(e.getSource()==button2){
				button2.setText("O");
				moveCounter++;
				checkWin();
			}
			else if(e.getSource()==button3){
				button3.setText("O");
				moveCounter++;
				checkWin();
			}
			else if(e.getSource()==button4){
				button4.setText("O");
				moveCounter++;
				checkWin();
			}
			else if(e.getSource()==button5){
				button5.setText("O");
				moveCounter++;
				checkWin();
			}
			else if(e.getSource()==button6){
				button6.setText("O");
				moveCounter++;
				checkWin();
			}
			else if(e.getSource()==button7){
				button7.setText("O");
				moveCounter++;
				checkWin();
			}
			else if(e.getSource()==button8){
				button8.setText("O");
				moveCounter++;
				checkWin();
			}
			else if(e.getSource()==button9){
				button9.setText("O");
				moveCounter++;
				checkWin();
			}
		}
		
	}

}
