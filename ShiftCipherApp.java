import java.util.Scanner;
class ShiftCipherApp
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

int shift;
String message;
System.out.println("Shift Cipher Algorithm Quiz");
System.out.println("===========================");
System.out.print("How many shifts would you want to use? ");
try {
    shift = sc.nextInt();
    sc.nextLine(); 
} catch (Exception e) {
    System.out.println("That is not an integer.");
    System.exit(0);
return;
}
System.out.println("Please enter a message to hit enter to encrypt it.");
    message = sc.next();
    sc.close();
    
    ShiftCipher src = new ShiftCipher (message, shift);
    src.cipher();
    System.out.println("Ciphered : " + src.getCiphered());
    src.decipher();
    System.out.println("Deciphered : " + src.getDeciphered());
    
}
}
