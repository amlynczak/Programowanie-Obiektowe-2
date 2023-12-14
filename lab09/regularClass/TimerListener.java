package regularClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerListener implements ActionListener{
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