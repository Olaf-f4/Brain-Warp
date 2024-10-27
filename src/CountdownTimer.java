import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {
    private int remainingTime;

    public CountdownTimer(int seconds){
        this.remainingTime = seconds;
    }

    public void startCountdown() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask(){
            @Override // Don't know what this does but yellow squiggle
            public void run(){
                if (remainingTime >= 0){
                    System.out.println(remainingTime--);
                } else{
                    timer.cancel();
                }
            }
        }, 0, 5000);
    }

    public int getRemainingTime(){
        return remainingTime;
    }
}
