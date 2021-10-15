package answer.simpleremote;

public class CurtainOffCommand implements Command {
    Curtain curtain;


    public CurtainOffCommand(Curtain curtain) {
        this.curtain = curtain;
    }


    @Override
    public void execute() {
        curtain.takeDown();        
    }
    
}
