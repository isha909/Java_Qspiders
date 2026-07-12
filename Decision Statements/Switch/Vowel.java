public class Vowel {
  public static void main(String[] args) {
    char ch = 'i';
    switch (ch) {
      case 'a','e','i','o','u':
        {
          System.out.println("Given character is vowel");
        }
        break;
      case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z':
        {
          System.out.println("Given character is a consonent");
        }
        break;
      default:
        {
          System.out.println("Given character is not an alphabet");
        }
    }
  }
}
