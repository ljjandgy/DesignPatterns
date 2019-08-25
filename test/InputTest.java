import decorate.java.LowerCaseInputStream;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    @Test
    public void inputTest(){
        //单个字符对于字节大小
        int c;
        //相对路径的话是以项目根目录作为文件目录起点
        try(InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("io.txt")))){
            //还能读取到内容才输出
            while ((c=in.read())>0){
                System.out.print((char)c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
