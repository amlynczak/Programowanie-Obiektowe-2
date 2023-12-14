import javax.swing.Timer;
import javax.swing.JFrame;

import innerClass.TimerWrapperInner;

public class Main{
    public static void main(String[] args){
        TimerWrapperInner wrapper = new TimerWrapperInner();

        wrapper.start();

        JFrame frame = new JFrame("frame");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(150,100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
};