package app;
public class Doctor implements Observer{
    private String state="보통";
    private String job="의사";
    private int time;

    Doctor(Clock clock){
        // clock.registerObserver(this);
    }

    @Override
    public void update(int time) {
        this.time = time;
        if (time >=9){
            state = "야근";
        }
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getState(){
        return state;
    }

}