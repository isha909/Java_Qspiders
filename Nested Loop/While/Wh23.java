public class Wh23 {
  public static void main (String[] args) {
    char i = 'A';
    while(i<='D'){
      char j = 'A';
      while(j<=i){
        System.out.print(i+" ");
        j++;
      }
      System.out.println();
      i++;
    }
  }
}
