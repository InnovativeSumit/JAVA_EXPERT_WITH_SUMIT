public class Literals {
    public static void main(String[] args) {
 
        // Integer Literals
        int decimalLiteral = 100; // Decimal
        // int[Datatypes] decimalLiterals [Identifiers/ Variables Name] = 100 [Literals]
        int binaryLiteral = 0b1100100; // Binary
        int octalLiteral = 0144; // Octal
        int hexLiteral = 0x64; // Hexadecimal

        System.out.println("===== Integer Literals =====");
        System.out.println("Decimal     : " + decimalLiteral);
        System.out.println("Binary      : " + binaryLiteral);
        System.out.println("Octal       : " + octalLiteral);
        System.out.println("Hexadecimal : " + hexLiteral);

        // Floating-point Literals
        float floatLiteral = 12.34f;
        double doubleLiteral = 123.456789;

        System.out.println("\n===== Floating-point Literals =====");
        System.out.println("Float   : " + floatLiteral);
        System.out.println("Double  : " + doubleLiteral);

        // Character Literal
        char charLiteral = 'A';
        System.out.println("\n===== Character Literal =====");
        System.out.println("Character: " + charLiteral);

        // Boolean Literal
        boolean boolLiteral = true;
        System.out.println("\n===== Boolean Literal =====");
        System.out.println("Boolean: " + boolLiteral);
        

    }
}
