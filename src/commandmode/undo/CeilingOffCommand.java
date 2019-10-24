package commandmode.undo;

/**
 * 关闭电风扇命令类
 */
public class CeilingOffCommand implements Command{
    private int prevSpeed;
    private CeilingFan ceilingFan;

    public CeilingOffCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        switch (prevSpeed){
            case CeilingFan.HIGH:
                ceilingFan.high();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFan.LOW:
                ceilingFan.low();
                break;
            case CeilingFan.OFF:
                ceilingFan.low();
                break;
            default:;
        }
    }
}
