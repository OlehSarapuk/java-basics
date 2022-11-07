public class Primitives {
  public static void main(String[] args) {
    byte theByte = 34; //[-128;127] 1byte
    short theShort = 12_342; //[-32,768;32,767] 2bytes
    int theInteger = 7_987_149; //[-2,147,483,648;2,147,483,647] 4bytes
    long theLong = 9_132_393_159L; //L or l at the end; [-9,223,372,036,854,775,808;9,223,372,036,854,775,808] 8bytes
    float theFloat = 3.14F; //F or f at the end; 6 to 7 decimal digits 4bytes
    double theDouble = 5.679; //15 decimal digits 8bytes
    boolean theBoolean = true; //true or false 1byte
    char theCharacter = 'A'; //characters 2bytes

    System.out.println(theByte);
    System.out.println(theShort);
    System.out.println(theInteger);
    System.out.println(theLong);
    System.out.println(theFloat);
    System.out.println(theDouble);
    System.out.println(theBoolean);
    System.out.println(theCharacter);
  }
}
