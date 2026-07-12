public class Wh14 {
  public static void main (String[] args) {
    char i = 'I';
    while(i>='A'){
      char j = i;
      while(j>=i-2){
        System.out.print(j+" ");
        j--;
      }
      System.out.println();
      i-=3;
    }
  }
}
