package JavaGrammar.StandardIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {

    //파일의 끝까지 1 바이트씩 자료 읽기, read는 없으면 -1 반환,
    public static void main(String[] args) {

        int i;
        try (FileInputStream fis = new FileInputStream("src/input.txt")) {

            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
