public class Wh9 {
  public static void main (String[] args) {
    int i = 1;
    while(i<=10){
      int j = i;
      while(j<=i+4){
        System.out.print(j+" ");
        j++;
      }
      System.out.println();
      i+=5;
    }
  }
}
