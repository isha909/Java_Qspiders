public class Patt14 {
  public static void main(String[] args) {
    for(char ch = 'I'; ch >= 'A'; ch-=3){
      for(char i = ch; i >= ch-2; i--){
        System.out.print(i+ " ");
      }
      System.out.println();
    }
  }
}
