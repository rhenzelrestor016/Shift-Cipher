class ShiftCipher
{

private String origString;
private String cipherString;
private String decipheredString;
private int shift;

private String getAlphabet(){
    return "abcdefghijklmnopqrstuvwxyz";
                            }

public ShiftCipher(String plain, int shift)
    {
    this.origString = plain ;
    this.shift = shift;
    }

private char shiftLetter(char origLetter, String type)
{
    String alphabet = this.getAlphabet();
    int letterPosition = alphabet.indexOf(origLetter);
    char shiftedLetter;
    int shiftedPosition = 0;
    
    if (type.equals("encrypt")) {
        shiftedPosition = (letterPosition + this.shift) % alphabet.length ();
    } else if (type.equals("decrypt")) {
        shiftedPosition = (letterPosition - this.shift) % alphabet.length ();
    
    if (shiftedPosition < 0) {
        shiftedPosition = alphabet.length() + shiftedPosition;
    }
    }
shiftedLetter = alphabet.charAt(shiftedPosition);
return shiftedLetter;
}

public String getCiphered()
{
return this.cipherString;
}
/**
* This method decrypts an encrypted string
* @param String
* @param int
* @return String
*/


public void cipher()
{
this.origString = this.origString.toLowerCase();
this.cipherString = "";
char shiftedLetter;
for (char letter: this.origString.toCharArray())
{
shiftedLetter = this.shiftLetter(letter, "encrypt");
this.cipherString += shiftedLetter;
}
}

public String getDeciphered()
{
return this.decipheredString;
}

public void decipher()
{
this.cipherString = this.cipherString.toLowerCase();
this.decipheredString = "";
char shiftedLetter;
for (char letter: this.cipherString.toCharArray())
{
shiftedLetter = this.shiftLetter(letter, "decrypt");
this.decipheredString += shiftedLetter;
}
}
}


