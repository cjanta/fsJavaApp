package com.todoapp;

import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class TaskContainer extends JPanel {
    private JScrollPane jScrollPane = null;

    public TaskContainer(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        jScrollPane = new JScrollPane(this);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane.setVisible(true);
    }

    public JScrollPane getScrollPane(){
        return jScrollPane;
    }

    public void addElement(Component component){
        add(component);
        revalidate();
        repaint();
    }

    public void removeElement(Component component){
        remove(component);
        revalidate();
        repaint();
    }
    
}
