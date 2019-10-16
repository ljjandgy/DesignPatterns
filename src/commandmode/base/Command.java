package commandmode.base;

/**
 * 命令对象接口，所有命令对象的公共接口，其execute方法能触发receiver的动作，但是是有Invoker来触发
 */
public interface Command {
    /**
     * 拥有执行命令的方法，其触发的是实际命令的具体操作
     */
    void execute();
}
