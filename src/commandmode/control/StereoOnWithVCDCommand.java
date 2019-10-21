package commandmode.control;

/**
 * 打开音响，并播放VCD的命令类
 */
public class StereoOnWithVCDCommand implements Command{
    private Stereo stereo;

    public StereoOnWithVCDCommand(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.on();
        stereo.setVcd();
    }
}
