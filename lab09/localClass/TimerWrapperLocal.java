package localClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class TimerWrapperLocal{
    private Timer timer;

    public TimerWrapperLocal(){
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
        }

        timer = new Timer(1000, new TimerListener(true));
    }

    public void start(){
        timer.start();
    }
}