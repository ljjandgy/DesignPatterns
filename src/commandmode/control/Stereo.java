package commandmode.control;

/**
 * 音响（音响相关command的receiver）
 */
public class Stereo {
    /**
     * 打开音响
     */
    public void on(){
        System.out.println("音响被打开了");
    }

    /**
     * 关闭音响
     */
    public void off(){
        System.out.println("关闭音响");
    }
    /**
     * 把音响设置成播放CD
     */
    public void setCd(){
        System.out.println("开始播放CD");
    }

    /**
     * 把音响设置成播放VCD
     */
    public void setVcd(){
        System.out.println("开始播放VCD");
    }

    /**
     * 把音响设置为播放广播
     */
    public void setRadio(){
        System.out.println("开始播放广播");
    }

}
