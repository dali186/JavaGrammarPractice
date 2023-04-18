package JavaGrammar.TExtends;

import JavaGrammar.Generic.GenericPrinter;
import JavaGrammar.Generic.Powder;

public class GenericPrinterTest {
    public static void main(String[] args) {

        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(powder);

        Powder p = powderPrinter.getMaterial();
        System.out.println(p);
        System.out.println(powderPrinter.toString());

    }
}
