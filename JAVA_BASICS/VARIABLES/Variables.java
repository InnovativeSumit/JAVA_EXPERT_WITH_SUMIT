public class Variables {
    public static void main(String[] args) {

        // Primitive Data Types
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 100;
        long longVar = 1234567890L;

        float floatVar = 12.34f;
        double doubleVar = 123.456789;

        char charVar = 'A';
        boolean boolVar = true;

    
        // Printing all variables
        System.out.println("===== Primitive Variables =====");
        System.out.println("byte    : " + byteVar);
        System.out.println("short   : " + shortVar);
        System.out.println("int     : " + intVar);
        System.out.println("long    : " + longVar);
        System.out.println("float   : " + floatVar);
        System.out.println("double  : " + doubleVar);
        System.out.println("char    : " + charVar);
        System.out.println("boolean : " + boolVar);

        // Non-Primitive Data Types
        String stringVar = "Hello, Java";
        int[] arrayVar = {10, 20, 30, 40, 50};

        System.out.println("\n===== Non-Primitive Variables =====");
        System.out.println("String  : " + stringVar);

        System.out.print("Array   : ");
        for (int value : arrayVar) {
            System.out.print(value + " ");
        }
    }
}
    

