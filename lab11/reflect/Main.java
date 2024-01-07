import javax.swing.Timer;
import javax.swing.JFrame;

import localClass.TimerWrapperLocal;

import java.lang.reflect.*;

public class Main{
    public static void main(String[] args){
        TimerWrapperLocal wrapper = new TimerWrapperLocal();

        wrapper.start();

        JFrame frame = new JFrame("frame");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(150,100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        java.lang.reflect.Method[] m = TimerWrapperLocal.class.getDeclaredMethods();
        System.out.println("zdefiniowane metody:");
        for(int i=0; i<m.length; i++) { System.out.println(m[i]); }
    }
};