package ch.pkg12.gui;

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class CH12GUI implements ActionListener {

    JButton btn;
     JFrame frame ;

    public static void main(String[] args) {

        CH12GUI obj = new CH12GUI();
        obj.go();

    }

    public void go() {

        //...................... Handel eventListener / Action .................... //
        /*
        JFrame frame = new JFrame();
        btn = new JButton("Click Me ");

        btn.addActionListener(this);
        frame.getContentPane().add(btn);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
         */
        //.......... Play With the paintComponent() ...............//
        /*JFrame frame = new JFrame("Gradient Circle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        MyDrawPanel panel = new MyDrawPanel();
        frame.add(panel);

        frame.setVisible(true);
         */
        //............... Draw button chnage the color of circle when cilck it .................
         frame = new JFrame();
        btn = new JButton("Change the color  ");
           
        
        btn.addActionListener(this);
        
        MyDrawPanel panel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH , btn);
        frame.getContentPane().add(BorderLayout.CENTER , panel);
        frame.setSize(300,300);
        frame.setVisible(true);
        
        
    }

    @Override 
    public void actionPerformed(ActionEvent ae){
        
        frame.repaint();
    }
    /*
        //  Section 1 of code
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        btn.setText("Things Happend !!!");
    }

     */
}
