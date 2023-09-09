package innerclasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoButtons {

    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
            
       TwoButtons bbt = new TwoButtons();
       bbt.doWork();
    }

    public void doWork() {

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelBtn = new JButton("Change Label");
        labelBtn.addActionListener(new LabelListener());

        JButton colorBtn = new JButton("Change Color");
        colorBtn.addActionListener(new ColorListener());

        label = new JLabel("i'm a label");
        MyDrawPanel panel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, colorBtn);
        frame.getContentPane().add(BorderLayout.EAST, labelBtn);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(500, 300);
        frame.setVisible(true);
    }

    class LabelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
                
            label.setText("DOneeeeee");
        }
    }

    class ColorListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
         frame.repaint();
        }
    }

}
