public class Timer {
    private int seconds;
    private int hundredthSeconds;

    public Timer () {
        this.seconds = 0;
        this.hundredthSeconds = 0;
    }

    public void advance() {
        if (hundredthSeconds == 99) {
            hundredthSeconds = 0;
            if (seconds == 59) {
                seconds = 0;
            } else {
                seconds ++;
            }
        } else {
            hundredthSeconds ++;
        }
    }

    public String toString () {
        if (hundredthSeconds < 10 && seconds < 10) {
            return "0" + seconds + ":0" + hundredthSeconds;
        } else if (hundredthSeconds < 10 && seconds > 9) {
            return + seconds + ":0" + hundredthSeconds;
        } else if (hundredthSeconds > 9 && seconds < 10) {
            return "0" + seconds + ":" + hundredthSeconds;
        }
        return seconds + ":" + hundredthSeconds;
    }
}