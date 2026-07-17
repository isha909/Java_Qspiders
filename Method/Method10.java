public class Method10 {
  public static void main(String[] args) {
    alpha1();
    alpha2();
    lower();
    upper();
  }

  private static void alpha1(){
    for(char ch = 'A'; ch <= 'Z'; ch++){
      System.out.println(ch);
    }
  }

  private static void alpha2(){
    for(char ch = 'a'; ch <= 'z'; ch++){
      System.out.println(ch);
    }
  }

  private static void lower(){
    char ch = 's';
    if(ch != 'a' && ch != 'e' && ch != 'o' && ch != 'i' && ch != 'u'){
      System.out.println("Lower case consonent");
    }
  }

  private static void upper(){
    char ch = 'S';
    if(ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'){
      System.out.println("Upper case consonent");
    }
  }
}
