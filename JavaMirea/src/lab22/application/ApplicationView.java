package lab22.application;

import javax.swing.*;

public class ApplicationView {
    private final JTextArea output;

    public ApplicationView(JTextArea output){
        this.output = output;
    }

    public void displayAnswer(String answer){
        output.setText(answer);
    }
}
