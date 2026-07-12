public class Wh17 {
  public static void main (String[] args) {
    int i = 9;
    while(i>=1){
      int j = i;
      while(j>=i-2){
        System.out.print(j+" ");
        j--;
      }
      System.out.println();
      i-=3;
    }
  }
}
