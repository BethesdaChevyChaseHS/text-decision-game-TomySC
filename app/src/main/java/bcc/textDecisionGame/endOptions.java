package bcc.textDecisionGame;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class endOptions {
    // Declaring references to the objects from App.java
    JTextArea text = new JTextArea();
    JButton leftButton = new JButton();
    JButton rightButton = new JButton();

    // Constructor
    public endOptions(JTextArea textInput, JButton leftInput, JButton rightInput){
        // Assigning references
        text = textInput;
        leftButton = leftInput;
        rightButton = rightInput;
    }

    // Set ending text on buttons
    public void endingButtons(){
        leftButton.setText("RESTART");
        rightButton.setText("END");
    }

    // Restart the game
    public void restart(){
        text.setText("A wildfire has started, which team will you deploy as?");
        leftButton.setText("Firefighters");
        rightButton.setText("Dozer Crew");
    }


}
