public class Patt20 {
  public static void main(String[] args) {
    int a = 3;
    for(int i = 1; i <= 2; i++){
      for(int j = 1; j <= 2; j++){
        System.out.print(a+" ");
        a*=3;
      }
      System.out.println();
    }
  }
}
