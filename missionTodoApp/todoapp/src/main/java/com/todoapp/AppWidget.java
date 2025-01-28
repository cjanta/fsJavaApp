package com.todoapp;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class AppWidget extends JFrame{

    private Dimension minDimension = new Dimension(400,300);
    
    public AppWidget(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(minDimension);
        setSize(minDimension);
        setLayout(new FlowLayout());

        InputTextField input = new InputTextField();
        add(input);

        TaskContainer container = new TaskContainer();
        NewButton cButton = new NewButton(container);
        add(container);
        add(cButton);


        pack();
        setVisible(true);

    }


}
