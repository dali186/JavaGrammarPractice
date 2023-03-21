package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {

    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(fileName);

        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {

        ThrowException test = new ThrowException();

        try {
            test.loadClass("src/a.txt", "java.lang.String");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("end");
    }
}
