package StandardIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {

    //파일에서 1 바이트씩 자료 읽기, try catch, 상위거 쓰면 굳이 중복 X, 읽는데 try catch, close 하는데도 try catch - null일수도 있으니께
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/input.txt");
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());
            System.out.println((char)fis.read());
        } catch (IOException e) {
            e.printStackTrace();
            try {
                fis.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (NullPointerException et) {
                System.out.println(et);
            }
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (NullPointerException et) {
                System.out.println(et);
            }
        }
    }
}
