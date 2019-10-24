package commandmode.undo;

/**
 * 设置电风扇转速为高档的命令类
 */
public class CeilingFanHighCommand implements Command{
    private CeilingFan ceilingFan;
    private int prevSpeed;
    public CeilingFanHighCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }
    public void execute(){
        //记录之前的档位
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
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
