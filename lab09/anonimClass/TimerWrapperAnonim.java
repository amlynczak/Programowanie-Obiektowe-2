package anonimClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class TimerWrapperAnonim{
    private Timer timer;

    public TimerWrapperAnonim(){

        timer = new Timer(1000, new ActionListener(){
            public boolean sound = true;

            public void actionPerformed(ActionEvent e){
                System.out.println("aktualny czas: "+java.time.LocalDateTime.now());

                if(sound){
                    System.out.println("beep");
                }
            }
        });
    }

    public void start(){
        timer.start();
    }
}