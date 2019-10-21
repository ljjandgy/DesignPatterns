package commandmode.control;

/**
 * 让音响播放CD的命令类（含打开音响的操作）
 */
public class StereoOnWithCDCommand implements Command{
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        //先打开音响
        stereo.on();
        //再设置为播放CD
        stereo.setCd();
    }
}
