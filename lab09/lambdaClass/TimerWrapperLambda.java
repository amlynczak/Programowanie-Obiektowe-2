package lambdaClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class TimerWrapperLambda{
    private Timer timer;
    private boolean sound;

    public TimerWrapperLambda(){
        timer = new Timer(1000, (ActionEvent e) -> {
            System.out.println("aktualny czas: "+java.time.LocalDateTime.now());

            if(sound){
                System.out.println("beep");
            }
        });
    }

    public void start(){
        timer.start();
    }
}