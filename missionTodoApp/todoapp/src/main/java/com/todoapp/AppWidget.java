package com.todoapp;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class AppWidget extends JFrame{

    private Dimension minDimension = new Dimension(400,300);
    
    public AppWidget(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(minDimension);
        setSize(minDimension);
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));

        JPanel hPanel = new JPanel();
        hPanel.setMaximumSize(new Dimension(400,100));
        InputTextField input = new InputTextField();
        hPanel.add(input);

        TaskContainer container = new TaskContainer();
        NewButton cButton = new NewButton(container);
        hPanel.add(cButton);
        add(hPanel);
        add(container.getScrollPane());


        pack();
        setVisible(true);

    }

}
