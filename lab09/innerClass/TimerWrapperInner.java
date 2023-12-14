package innerClass;

import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerWrapperInner{
    private Timer timer;
    class TimerListener implements ActionListener{ 
        public boolean sound;

        public TimerListener(boolean beep){
            this.sound = beep;
        }

        public void actionPerformed(ActionEvent e){
            System.out.println("aktualny czas: "+java.time.LocalDateTime.now());

            if(sound){
                System.out.println("beep");
            }
        }
    };

    public TimerWrapperInner(){
        timer = new Timer(1000, new TimerListener(true));
    }

    public void start(){
        timer.start();
    }
}