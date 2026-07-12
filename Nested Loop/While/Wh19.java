public class Wh19 {
  public static void main (String[] args) {
    int a = 5;
    int i = 1;
    while(i<=2){
      int j = 1;
      while(j<= 2){
        System.out.print(a+" ");
        a*=5;
        j++;
      }
      System.out.println();
      i++;
    }
  }
}
