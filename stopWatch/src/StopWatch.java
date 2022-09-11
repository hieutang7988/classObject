import java.util.Date;

public class StopWatch {
   private long startTime , endTime;
    //Date date = new Date();
    public StopWatch () {
    }

    public long getStartTime () {
        return this.startTime;
    }
    public long getEndTime () {
        return this.endTime;
    }
    public void start () {
        this.startTime = new Date().getTime();
    }
    public void end () {
        this.endTime = new Date().getTime();
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
