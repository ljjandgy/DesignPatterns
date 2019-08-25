package decorate.java;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * io输入流装饰器，效果为把所有的输入字符都变成小写
 */
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * 首先初始化父类的组件对象
     * @param in 输入流对象
     */
    public LowerCaseInputStream(InputStream in){
        super(in);
    }

    /**
     * 把读取到的单个字节转换为小写（单个字符的完整字节码）
     * @return 小写字母的ASCII码值
     * @throws IOException
     */
    @Override
    public int read() throws IOException{
        int c = super.read();
        return c==-1?c:Character.toLowerCase((char)c);
    }

    /**
     * 把字节数组的值转换为小写(一个数组中包含了很多个字符的字节码)
     * @param b 字节数组
     * @param offset 偏移量
     * @param len 长度
     * @return 装换后的值
     * @throws IOException
     */
    @Override
    public int read(byte[] b,int offset,int len) throws IOException{
        int result = super.read(b,offset,len);
        for (int i=offset;i<offset+result;i++){
            //每一个对象的字节码对应的就是一个字符
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
