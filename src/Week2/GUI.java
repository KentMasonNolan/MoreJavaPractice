package Week2;

import javax.swing.*;
import java.awt.*;

public class GUI{
        public static void main(String args[]){
            JFrame frame = new JFrame("My First Week2.GUI");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300,300);
            JButton button = new JButton("Press");
            frame.getContentPane().add(button); // Adds Button to content pane of frame
            frame.setVisible(true);

    }
}
