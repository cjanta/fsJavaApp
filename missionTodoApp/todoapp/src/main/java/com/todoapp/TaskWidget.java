package com.todoapp;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TaskWidget extends JPanel{
    

    public TaskWidget(){
        setLayout(new FlowLayout());

        JCheckBox jCheckBox = new JCheckBox();
        add(jCheckBox);
        JLabel jLabel = new JLabel();
        add(jLabel);
        JButton jButton = new JButton();
        add(jButton);
    }
}
