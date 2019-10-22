package commandmode.undo;

/**
 * 带撤销的命令类
 */
public interface Command {
    /**
     * 执行方法
     */
    void execute();

    /**
     * 撤销刚才执行的方法
     */
    void undo();
}
