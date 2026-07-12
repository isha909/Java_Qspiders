public class Wh24 {
  public static void main (String[] args) {
    char ch = 'A';
    int i = 1;
    while(i<=4){
      char j = 1;
      while(j<=i){
        System.out.print(ch+" ");
        ch++;
        j++;
      }
      System.out.println();
      i++;
    }
  }
}
