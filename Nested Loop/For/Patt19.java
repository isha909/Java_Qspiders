public class Patt19 {
  public static void main(String[] args) {
    int a = 5;
    for(int i = 1; i <= 2; i++){
      for(int j = 1; j <= 2; j++){
        System.out.print(a + " ");
        a*=5;
      }
      System.out.println();
    }
  }
}
