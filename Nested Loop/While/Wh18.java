public class Wh18 {
  public static void main (String[] args) {
    int i = 1;
    while(i<=12){
      int j = i;
      while(j<=i+2){
        System.out.print(j*2+" ");
        j++;
      }
      System.out.println();
      i+=3;
    }
  }
}
