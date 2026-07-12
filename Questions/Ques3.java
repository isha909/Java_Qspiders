public class Ques3{
  public static void main (String[] args){

    // Ques 14: Check if the given character is 'A', 'a' or not 
    char alpha1 = 'c';
    String out1 = (alpha1 == 'A' || alpha1 == 'a' ? "Character is A or a" : "Not A or a");
    System.out.println(out1);

    // Ques 15: Check if the given character is 'Q', 'q' or not 
    char alpha2 = 'q';
    String out2 = (alpha2 == 'Q' || alpha2 == 'q' ? "Character is Q or q" : "Not Q or q");
    System.out.println(out2);

    // Ques 16: Check if the given character is uppercase character or not 
    char alpha3 = 'H';
    String out3 = (alpha3 >= 'A' && alpha3 <= 'Z' ? "Character is uppercase" : "Not uppercase");
    System.out.println(out3);

    // Ques 17: Check if the given character is lowercase character or not //ch >='a' ||ch<='z'
    char alpha4 = 'i';
    String out4 = (alpha4 >= 'a' && alpha4 <= 'z' ? "Character is lowercase" : "Not lowercase");
    System.out.println(out4);

    // Ques 18: Check if the given character is alphabet or not 
    char alpha5 = 'i';
    String out5 = (alpha5 >= 'a' || alpha5 <= 'z' || alpha5 >= 'A' || alpha5 <= 'Z'? "Character is alphabet" : "Not an alphabet");
    System.out.println(out5);

    // Ques 19: Check if the given character is digit character or not
    char alpha6 = '8';
    String out6 = (alpha6 >= '0' && alpha6 <= '9' ? "Character is digit number" : "Character is not digit number");
    System.out.println(out6);

    // Ques 20: Check if the given character is uppercase vowel or not
    char alpha7 = 'E';
    String out7 = (alpha7 == 'A' || alpha7 == 'E' || alpha7 == 'I' || alpha7 == 'O' || alpha7 == 'U'? "Character is uppercase vowel" : "Not an uppercase vowel");
    System.out.println(out7);

    // Ques 21: Check if the given character is lowercase vowel or not
    char alpha8 = 'i';
    String out8 = (alpha8 == 'a' || alpha8 == 'e' || alpha8 == 'i' || alpha8 == 'o' || alpha8 == 'u'? "Character is lowercase vowel" : "Not a lowercase vowel");
    System.out.println(out8);

    // Ques 22: Check if the given character is vowel or not
    char alpha9 = 'i';
    String out9 = (alpha9 == 'a' || alpha9 == 'e' || alpha9 == 'i' || alpha9 == 'o' || alpha9 == 'u' || alpha9 == 'A' || alpha9 == 'E' || alpha9 == 'I' || alpha9 == 'O' || alpha9 == 'U'? "Character is a vowel" : "Not a vowel");
    System.out.println(out9);

    // Ques 23: Check if the given character is uppercase consonent or not
    char alpha10 = 'W';
    String out10 = (alpha10 > 'A' && alpha10 <= 'Z' && alpha10 != 'A' && alpha10 != 'E' && alpha10 != 'I' && alpha10 != 'O' && alpha10 != 'U'? "Character is an uppercase consonent" : "Not an uppercase consonent");
    System.out.println(out10);

    // Ques 24: Check if the given character is lowercase consonent or not
    char alpha11 = 'k';
    String out11 = (alpha11 > 'a' && alpha11 <= 'z' && alpha11 != 'a' && alpha11 != 'e' && alpha11 != 'i' && alpha11 != 'o' && alpha11 != 'u'? "Character is a lowercase consonent" : "Not a lowercase consonent");
    System.out.println(out11);

  }
}