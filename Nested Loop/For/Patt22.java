public class Patt22 {
  public static void main(String[] args) {
    for(char ch = 'A'; ch <= 'D'; ch++){
      for(char j = 'A'; j <= ch; j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
