public class Do28 {
  public static void main(String[] args) {
    int a = 1;
    do{
      int b = 1;
      do{
        System.out.print(a + " ");
        b++;
      } while(b <= a);
      System.out.println();
      a++;
    }while(a <= 4);
  }
}
