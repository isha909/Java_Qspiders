public class Patt8 {
  public static void main(String[] args) {
    for(char i = 'A'; i <= 'L'; i+=4){
      for(char ch = i; ch <= i+3 ; ch++){
        System.out.print(ch);
      }
      System.out.println();
    }
  }
}
