package app;

public class Developer implements Observer{
    private String state="보통";
    private String job="개발자";
    private int time = 0;
    private Clock clock;

    Developer(Clock clock){
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
        if (time>=9){
            this.state = "자기계발 진행중";
        }
        
    }
}