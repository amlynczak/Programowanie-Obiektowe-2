package regularClass;

import javax.swing.Timer;
import regularClass.TimerListener;

public class TimerWrapper{
    private Timer timer;
    public TimerListener listener;

    public TimerWrapper(){
        timer = new Timer(1000, new TimerListener(true));
    }

    public void start(){
        timer.start();
    }
}