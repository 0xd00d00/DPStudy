package answer.simpleremote;

public class CurtainOnCommand implements Command {

    Curtain curtain;


    public CurtainOnCommand(Curtain curtain) {
        this.curtain = curtain;
    }


    @Override
    public void execute() {
        curtain.setUp();        
    }
    
}
