public class Patt17 {
  public static void main(String[] args) {
    for(int ch = 9; ch >= 1; ch-=3){
      for(int i = ch; i >= ch-2; i--){
        System.out.print(i);
      }
      System.out.println();
    }
  }
}
