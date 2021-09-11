package app;
public class Nerd implements Observer{
    private String state="보통";
    private String job="백수";
    private int time = 0;
    private Clock clock;
    public Nerd(Clock clock) {
    }
    public String getState(){
        return state;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    @Override
    public void update(int time) {
        this.time = time;
        if(time>=9){
            this.state = "꿈나라.";
        }
    }

}