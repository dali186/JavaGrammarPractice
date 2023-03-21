package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/a.txt");//src폴더 아래에 생성
            System.out.println("read");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return;
        } finally {
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("finally");
        }
        System.out.println("end");
    }
}
