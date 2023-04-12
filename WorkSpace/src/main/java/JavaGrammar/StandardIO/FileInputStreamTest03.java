package JavaGrammar.StandardIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest03 {

    public static void main(String[] args) {

        int num = 10;
        long a = 3;
        char c= 65-64;
        int i;
        try (FileInputStream fis = new FileInputStream("src/input2.txt")){

            byte[] bs = new byte[10];

            while ((i = fis.read(bs)) != -1) {

                // for(int ch : bs) 버퍼에 남은 것들이 다음에 딸려서 출력됨
                for(int j = 0 ; j < i; j++) {
                    System.out.print((char)bs[j]);
                }
                System.out.println(" : " + i + "byte read");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
