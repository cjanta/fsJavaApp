package com.todoapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class NewButton extends JButton implements ActionListener{

    private TaskContainer container = null;

    public NewButton(TaskContainer container){
        this.container = container;
        this.setText("Add new Task");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       container.add(new TaskWidget());
    }
}


