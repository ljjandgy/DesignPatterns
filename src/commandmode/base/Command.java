package commandmode.base;

/**
 * 命令对象接口
 */
public interface Command {
    /**
     * 拥有执行命令的方法，其触发的是实际命令的具体操作
     */
    void execute();
}
