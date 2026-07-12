public class Patt24 {
  public static void main(String[] args) {
    char i = 'A';
    for(int ch = 1; ch <= 4; ch++){
      for(int j = 1; j <= ch; j++){
        System.out.print(i + " ");
        i++;
      }
      System.out.println();
    }
  }
}
