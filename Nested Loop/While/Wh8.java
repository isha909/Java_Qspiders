public class Wh8 {
  public static void main (String[] args) {
    char i = 'A';
    while(i<='L'){
      char j = i;
      while(j<=i+3){
        System.out.print(j+" ");
        j++;
      }
      System.out.println();
      i+=4;
    }
  }
}
