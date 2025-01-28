package com.todoapp;

import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class TaskContainer extends JPanel {
    
    public TaskContainer(){
        add(new JScrollPane(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER));
    }

    public void addElement(Component component){
        add(component);

    }

    public void removeElement(Component component){
        remove(component);
    }
    
}
