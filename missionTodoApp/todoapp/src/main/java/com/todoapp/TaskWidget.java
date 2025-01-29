package com.todoapp;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TaskWidget extends JPanel{
    

    public TaskWidget(){
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        JCheckBox jCheckBox = new JCheckBox();
        add(jCheckBox);
        JLabel jLabel = new JLabel();
        jLabel.setText("Taskbeschreibung");
        add(jLabel);
        JButton jButton = new JButton();
        jButton.setText("Button");
        add(jButton);
        
        setVisible(true);
    }
}
