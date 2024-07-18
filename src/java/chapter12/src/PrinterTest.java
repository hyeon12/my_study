public class PrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<>();

        plasticGenericPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticGenericPrinter.getMaterial();
        System.out.println(plasticGenericPrinter);

        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();

        powderGenericPrinter.setMaterial(new Powder());
        Powder powder = powderGenericPrinter.getMaterial();
        //System.out.println(powder);
        System.out.println(powder.toString());
        powder.doPrinting();
        //System.out.println(powderGenericPrinter);

    }
}
