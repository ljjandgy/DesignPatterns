package commandmode.control;

/**
 * 打开音响并让音响播放广播的命令类
 */
public class StareOnWithRadioCommand implements Command {
    private Stereo stereo;

    public StareOnWithRadioCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setRadio();
    }
}
