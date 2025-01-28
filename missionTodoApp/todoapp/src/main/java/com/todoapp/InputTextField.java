package com.todoapp;

import javax.swing.JTextField;
import java.awt.Dimension;

public class InputTextField extends JTextField{
    
    private Dimension minDimension = new Dimension(100,25);

    public InputTextField(){
        setMinimumSize(minDimension);
        setSize(minDimension);
        

    }
    


}
